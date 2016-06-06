{:namespaces
 ({:doc
   "Local macros and symbol macros\n\nLocal macros are defined by a macrolet form. They are usable only\ninside its body. Symbol macros can be defined globally\n(defsymbolmacro) or locally (symbol-macrolet). A symbol\nmacro defines a form that replaces a symbol during macro\nexpansion. Function arguments and symbols bound in let\nforms are not subject to symbol macro expansion.\n\nLocal macros are most useful in the definition of the expansion\nof another macro, they may be used anywhere. Global symbol\nmacros can be used only inside a with-symbol-macros form.",
   :author "Konrad Hinsen",
   :name "clojure.tools.macro",
   :wiki-url "http://clojure.github.io/tools.macro/index.html",
   :source-url
   "https://github.com/clojure/tools.macro/blob/7398f083a3c1504af07b6493a36962577fd1fc79/src/main/clojure/clojure/tools/macro.clj"}),
 :vars
 ({:raw-source-url
   "https://github.com/clojure/tools.macro/raw/7398f083a3c1504af07b6493a36962577fd1fc79/src/main/clojure/clojure/tools/macro.clj",
   :name "defsymbolmacro",
   :file "src/main/clojure/clojure/tools/macro.clj",
   :source-url
   "https://github.com/clojure/tools.macro/blob/7398f083a3c1504af07b6493a36962577fd1fc79/src/main/clojure/clojure/tools/macro.clj#L232",
   :line 232,
   :var-type "macro",
   :arglists ([symbol expansion]),
   :doc
   "Define a symbol macro. Because symbol macros are not part of\nClojure's built-in macro expansion system, they can be used only\ninside a with-symbol-macros form.",
   :namespace "clojure.tools.macro",
   :wiki-url
   "http://clojure.github.io/tools.macro//index.html#clojure.tools.macro/defsymbolmacro"}
  {:raw-source-url
   "https://github.com/clojure/tools.macro/raw/7398f083a3c1504af07b6493a36962577fd1fc79/src/main/clojure/clojure/tools/macro.clj",
   :name "deftemplate",
   :file "src/main/clojure/clojure/tools/macro.clj",
   :source-url
   "https://github.com/clojure/tools.macro/blob/7398f083a3c1504af07b6493a36962577fd1fc79/src/main/clojure/clojure/tools/macro.clj#L246",
   :line 246,
   :var-type "macro",
   :arglists ([name params & forms]),
   :doc
   "Define a macro that expands into forms after replacing the\nsymbols in params (a vector) by the corresponding parameters\ngiven in the macro call.",
   :namespace "clojure.tools.macro",
   :wiki-url
   "http://clojure.github.io/tools.macro//index.html#clojure.tools.macro/deftemplate"}
  {:raw-source-url
   "https://github.com/clojure/tools.macro/raw/7398f083a3c1504af07b6493a36962577fd1fc79/src/main/clojure/clojure/tools/macro.clj",
   :name "macrolet",
   :file "src/main/clojure/clojure/tools/macro.clj",
   :source-url
   "https://github.com/clojure/tools.macro/blob/7398f083a3c1504af07b6493a36962577fd1fc79/src/main/clojure/clojure/tools/macro.clj#L211",
   :line 211,
   :var-type "macro",
   :arglists ([fn-bindings & exprs]),
   :doc
   "Define local macros that are used in the expansion of exprs. The\nsyntax is the same as for letfn forms.",
   :namespace "clojure.tools.macro",
   :wiki-url
   "http://clojure.github.io/tools.macro//index.html#clojure.tools.macro/macrolet"}
  {:raw-source-url
   "https://github.com/clojure/tools.macro/raw/7398f083a3c1504af07b6493a36962577fd1fc79/src/main/clojure/clojure/tools/macro.clj",
   :name "mexpand",
   :file "src/main/clojure/clojure/tools/macro.clj",
   :source-url
   "https://github.com/clojure/tools.macro/blob/7398f083a3c1504af07b6493a36962577fd1fc79/src/main/clojure/clojure/tools/macro.clj#L266",
   :line 266,
   :var-type "function",
   :arglists ([form]),
   :doc
   "Like clojure.core/macroexpand, but takes into account symbol macros.",
   :namespace "clojure.tools.macro",
   :wiki-url
   "http://clojure.github.io/tools.macro//index.html#clojure.tools.macro/mexpand"}
  {:raw-source-url
   "https://github.com/clojure/tools.macro/raw/7398f083a3c1504af07b6493a36962577fd1fc79/src/main/clojure/clojure/tools/macro.clj",
   :name "mexpand-1",
   :file "src/main/clojure/clojure/tools/macro.clj",
   :source-url
   "https://github.com/clojure/tools.macro/blob/7398f083a3c1504af07b6493a36962577fd1fc79/src/main/clojure/clojure/tools/macro.clj#L258",
   :line 258,
   :var-type "function",
   :arglists ([form]),
   :doc
   "Like clojure.core/macroexpand-1, but takes into account symbol macros.",
   :namespace "clojure.tools.macro",
   :wiki-url
   "http://clojure.github.io/tools.macro//index.html#clojure.tools.macro/mexpand-1"}
  {:raw-source-url
   "https://github.com/clojure/tools.macro/raw/7398f083a3c1504af07b6493a36962577fd1fc79/src/main/clojure/clojure/tools/macro.clj",
   :name "mexpand-all",
   :file "src/main/clojure/clojure/tools/macro.clj",
   :source-url
   "https://github.com/clojure/tools.macro/blob/7398f083a3c1504af07b6493a36962577fd1fc79/src/main/clojure/clojure/tools/macro.clj#L274",
   :line 274,
   :var-type "function",
   :arglists ([form]),
   :doc "Perform a full recursive macro expansion of a form.",
   :namespace "clojure.tools.macro",
   :wiki-url
   "http://clojure.github.io/tools.macro//index.html#clojure.tools.macro/mexpand-all"}
  {:raw-source-url
   "https://github.com/clojure/tools.macro/raw/7398f083a3c1504af07b6493a36962577fd1fc79/src/main/clojure/clojure/tools/macro.clj",
   :name "name-with-attributes",
   :file "src/main/clojure/clojure/tools/macro.clj",
   :source-url
   "https://github.com/clojure/tools.macro/blob/7398f083a3c1504af07b6493a36962577fd1fc79/src/main/clojure/clojure/tools/macro.clj#L282",
   :line 282,
   :var-type "function",
   :arglists ([name macro-args]),
   :doc
   "To be used in macro definitions.\nHandles optional docstrings and attribute maps for a name to be defined\nin a list of macro arguments. If the first macro argument is a string,\nit is added as a docstring to name and removed from the macro argument\nlist. If afterwards the first macro argument is a map, its entries are\nadded to the name's metadata map and the map is removed from the\nmacro argument list. The return value is a vector containing the name\nwith its extended metadata map and the list of unprocessed macro\narguments.",
   :namespace "clojure.tools.macro",
   :wiki-url
   "http://clojure.github.io/tools.macro//index.html#clojure.tools.macro/name-with-attributes"}
  {:raw-source-url
   "https://github.com/clojure/tools.macro/raw/7398f083a3c1504af07b6493a36962577fd1fc79/src/main/clojure/clojure/tools/macro.clj",
   :name "symbol-macrolet",
   :file "src/main/clojure/clojure/tools/macro.clj",
   :source-url
   "https://github.com/clojure/tools.macro/blob/7398f083a3c1504af07b6493a36962577fd1fc79/src/main/clojure/clojure/tools/macro.clj#L222",
   :line 222,
   :var-type "macro",
   :arglists ([symbol-bindings & exprs]),
   :doc
   "Define local symbol macros that are used in the expansion of exprs.\nThe syntax is the same as for let forms.",
   :namespace "clojure.tools.macro",
   :wiki-url
   "http://clojure.github.io/tools.macro//index.html#clojure.tools.macro/symbol-macrolet"}
  {:raw-source-url
   "https://github.com/clojure/tools.macro/raw/7398f083a3c1504af07b6493a36962577fd1fc79/src/main/clojure/clojure/tools/macro.clj",
   :name "with-symbol-macros",
   :file "src/main/clojure/clojure/tools/macro.clj",
   :source-url
   "https://github.com/clojure/tools.macro/blob/7398f083a3c1504af07b6493a36962577fd1fc79/src/main/clojure/clojure/tools/macro.clj#L241",
   :line 241,
   :var-type "macro",
   :arglists ([& exprs]),
   :doc "Fully expand exprs, including symbol macros.",
   :namespace "clojure.tools.macro",
   :wiki-url
   "http://clojure.github.io/tools.macro//index.html#clojure.tools.macro/with-symbol-macros"})}
