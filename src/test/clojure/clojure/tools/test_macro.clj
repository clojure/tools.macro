;; Copyright (c) Konrad Hinsen 2011. All rights reserved.  The use
;; and distribution terms for this software are covered by the Eclipse
;; Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;; which can be found in the file epl-v10.html at the root of this
;; distribution.  By using this software in any fashion, you are
;; agreeing to be bound by the terms of this license.  You must not
;; remove this notice, or any other, from this software.

(ns clojure.tools.test-macro
  [:use clojure.test]
  [:require [clojure.tools.macro :as macro]])

(use-fixtures :each
  (fn [f] (binding [*ns* (the-ns 'clojure.tools.test-macro)]
            (f))))

(deftest macrolet-test
  (is (= (macroexpand-1
           '(macro/macrolet [(foo [form] `(~form ~form))]  (foo x)))
         '(do (x x))))
  ;; Here, foo is a let-bound (thus protected) symbol, so it must not be
  ;; subject to macro expansion.
  (is (= (macroexpand-1
          '(macro/macrolet [(foo [form] `(inc ~form))]
             (let [foo identity]
               (foo 1))))
         '(do (let* [foo identity] (foo 1)))))
  ;; And the same for letfn-bound symbols.
  (is (= (macroexpand-1
          '(macro/macrolet [(foo [form] `(inc ~form))]
             (letfn [(foo [x] x)]
               (foo 1))))
         '(do (letfn* [foo (fn* foo ([x] x))]
                (foo 1))))))

(deftest symbol-macrolet-test
  (is (= (macroexpand-1
           '(macro/symbol-macrolet [x xx y yy]
              (exp [a y] (x y))))
         '(do (exp [a yy] (xx yy)))))
  (is (= (macroexpand-1
           '(macro/symbol-macrolet [def foo]
              (def def def)))
         '(do (def def foo))))
  (is (= (macroexpand-1
           '(macro/symbol-macrolet [x foo z bar]
              (let [a x b y x b] [a b x z])))
         '(do (let* [a foo b y x b] [a b x bar]))))
  (is (= (macroexpand-1
           '(macro/symbol-macrolet [x foo z bar]
              (fn ([x y] [x y z]) ([x y z] [x y z]))))
         '(do (fn* ([x y] [x y bar]) ([x y z] [x y z])))))
  (is (= (macroexpand-1
           '(macro/symbol-macrolet [x foo z bar]
              (fn f ([x y] [x y z]) ([x y z] [x y z]))))
         '(do (fn* f ([x y] [x y bar]) ([x y z] [x y z])))))
  (is (thrown? Exception
               (macroexpand-1
                '(macro/symbol-macrolet [user/bar 42]
                                        (+ (- bar 2) (* bar 3))))))
  (is (= (macroexpand-1
           '(macro/symbol-macrolet [bar 42]
                                   (+ (- bar 2) (* bar 3))))
         '(do (+ (- 42 2) (* 42 3)))))
  (comment
    (is (= (nth (second (macroexpand-1
                       '(macro/symbol-macrolet [x xx y yy z zz]
                          (domonad m [a x b y x z] [a b x z])))) 2)
         '(do (m-bind xx (fn* ([a]
              (m-bind yy (fn* ([b]
              (m-bind zz (fn* ([x]
              (m-result [a b x zz])))))))))))))))

(deftest symbol-test
  (macro/defsymbolmacro sum-2-3 (plus 2 3))
  (is (= (macroexpand '(macro/with-symbol-macros (+ 1 sum-2-3)))
         '(do (+ 1 (plus 2 3)))))
  (is (= (macroexpand '(macro/macrolet [(plus [a b] `(+ ~a ~b))] (+ 1 sum-2-3)))
         '(do (+ 1 (clojure.core/+ 2 3)))))
  (ns-unmap *ns* 'sum-2-3))

(deftest mexpand-all-test
  (is (= (macro/mexpand-all '(let [object (fn [] 3)] (object)))
         '(let* [object (fn* ([] 3))] (object))))
  (is (= (macro/mexpand-all '(let [or (fn [] 3)] (or)))
         '(let* [or (fn* ([] 3))] (or)))))
