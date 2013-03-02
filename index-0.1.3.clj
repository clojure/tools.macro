{:namespaces
 ({:source-url
   "https://github.com/clojure/tools.macro/blob/19c8197e10079f04e55d81c26884b9248762c2ca/src/main/clojure/clojure/tools/macro.clj",
   :wiki-url
   "http://clojure.github.com/tools.macro/clojure.tools.macro-api.html",
   :name "clojure.tools.macro",
   :author "Konrad Hinsen",
   :doc
   "Local macros and symbol macros\n\nLocal macros are defined by a macrolet form. They are usable only\ninside its body. Symbol macros can be defined globally\n(defsymbolmacro) or locally (symbol-macrolet). A symbol\nmacro defines a form that replaces a symbol during macro\nexpansion. Function arguments and symbols bound in let\nforms are not subject to symbol macro expansion.\n\nLocal macros are most useful in the definition of the expansion\nof another macro, they may be used anywhere. Global symbol\nmacros can be used only inside a with-symbol-macros form."}),
 :vars
 ({:arglists ([symbol expansion]),
   :name "defsymbolmacro",
   :namespace "clojure.tools.macro",
   :source-url
   "https://github.com/clojure/tools.macro/blob/19c8197e10079f04e55d81c26884b9248762c2ca/src/main/clojure/clojure/tools/macro.clj#L225",
   :raw-source-url
   "https://github.com/clojure/tools.macro/raw/19c8197e10079f04e55d81c26884b9248762c2ca/src/main/clojure/clojure/tools/macro.clj",
   :wiki-url
   "http://clojure.github.com/tools.macro//clojure.tools.macro-api.html#clojure.tools.macro/defsymbolmacro",
   :doc
   "Define a symbol macro. Because symbol macros are not part of\nClojure's built-in macro expansion system, they can be used only\ninside a with-symbol-macros form.",
   :var-type "macro",
   :line 225,
   :file "src/main/clojure/clojure/tools/macro.clj"}
  {:arglists ([name params & forms]),
   :name "deftemplate",
   :namespace "clojure.tools.macro",
   :source-url
   "https://github.com/clojure/tools.macro/blob/19c8197e10079f04e55d81c26884b9248762c2ca/src/main/clojure/clojure/tools/macro.clj#L239",
   :raw-source-url
   "https://github.com/clojure/tools.macro/raw/19c8197e10079f04e55d81c26884b9248762c2ca/src/main/clojure/clojure/tools/macro.clj",
   :wiki-url
   "http://clojure.github.com/tools.macro//clojure.tools.macro-api.html#clojure.tools.macro/deftemplate",
   :doc
   "Define a macro that expands into forms after replacing the\nsymbols in params (a vector) by the corresponding parameters\ngiven in the macro call.",
   :var-type "macro",
   :line 239,
   :file "src/main/clojure/clojure/tools/macro.clj"}
  {:arglists ([fn-bindings & exprs]),
   :name "macrolet",
   :namespace "clojure.tools.macro",
   :source-url
   "https://github.com/clojure/tools.macro/blob/19c8197e10079f04e55d81c26884b9248762c2ca/src/main/clojure/clojure/tools/macro.clj#L204",
   :raw-source-url
   "https://github.com/clojure/tools.macro/raw/19c8197e10079f04e55d81c26884b9248762c2ca/src/main/clojure/clojure/tools/macro.clj",
   :wiki-url
   "http://clojure.github.com/tools.macro//clojure.tools.macro-api.html#clojure.tools.macro/macrolet",
   :doc
   "Define local macros that are used in the expansion of exprs. The\nsyntax is the same as for letfn forms.",
   :var-type "macro",
   :line 204,
   :file "src/main/clojure/clojure/tools/macro.clj"}
  {:arglists ([form]),
   :name "mexpand",
   :namespace "clojure.tools.macro",
   :source-url
   "https://github.com/clojure/tools.macro/blob/19c8197e10079f04e55d81c26884b9248762c2ca/src/main/clojure/clojure/tools/macro.clj#L259",
   :raw-source-url
   "https://github.com/clojure/tools.macro/raw/19c8197e10079f04e55d81c26884b9248762c2ca/src/main/clojure/clojure/tools/macro.clj",
   :wiki-url
   "http://clojure.github.com/tools.macro//clojure.tools.macro-api.html#clojure.tools.macro/mexpand",
   :doc
   "Like clojure.core/macroexpand, but takes into account symbol macros.",
   :var-type "function",
   :line 259,
   :file "src/main/clojure/clojure/tools/macro.clj"}
  {:arglists ([form]),
   :name "mexpand-1",
   :namespace "clojure.tools.macro",
   :source-url
   "https://github.com/clojure/tools.macro/blob/19c8197e10079f04e55d81c26884b9248762c2ca/src/main/clojure/clojure/tools/macro.clj#L251",
   :raw-source-url
   "https://github.com/clojure/tools.macro/raw/19c8197e10079f04e55d81c26884b9248762c2ca/src/main/clojure/clojure/tools/macro.clj",
   :wiki-url
   "http://clojure.github.com/tools.macro//clojure.tools.macro-api.html#clojure.tools.macro/mexpand-1",
   :doc
   "Like clojure.core/macroexpand-1, but takes into account symbol macros.",
   :var-type "function",
   :line 251,
   :file "src/main/clojure/clojure/tools/macro.clj"}
  {:arglists ([form]),
   :name "mexpand-all",
   :namespace "clojure.tools.macro",
   :source-url
   "https://github.com/clojure/tools.macro/blob/19c8197e10079f04e55d81c26884b9248762c2ca/src/main/clojure/clojure/tools/macro.clj#L267",
   :raw-source-url
   "https://github.com/clojure/tools.macro/raw/19c8197e10079f04e55d81c26884b9248762c2ca/src/main/clojure/clojure/tools/macro.clj",
   :wiki-url
   "http://clojure.github.com/tools.macro//clojure.tools.macro-api.html#clojure.tools.macro/mexpand-all",
   :doc "Perform a full recursive macro expansion of a form.",
   :var-type "function",
   :line 267,
   :file "src/main/clojure/clojure/tools/macro.clj"}
  {:arglists ([name macro-args]),
   :name "name-with-attributes",
   :namespace "clojure.tools.macro",
   :source-url
   "https://github.com/clojure/tools.macro/blob/19c8197e10079f04e55d81c26884b9248762c2ca/src/main/clojure/clojure/tools/macro.clj#L275",
   :raw-source-url
   "https://github.com/clojure/tools.macro/raw/19c8197e10079f04e55d81c26884b9248762c2ca/src/main/clojure/clojure/tools/macro.clj",
   :wiki-url
   "http://clojure.github.com/tools.macro//clojure.tools.macro-api.html#clojure.tools.macro/name-with-attributes",
   :doc
   "To be used in macro definitions.\nHandles optional docstrings and attribute maps for a name to be defined\nin a list of macro arguments. If the first macro argument is a string,\nit is added as a docstring to name and removed from the macro argument\nlist. If afterwards the first macro argument is a map, its entries are\nadded to the name's metadata map and the map is removed from the\nmacro argument list. The return value is a vector containing the name\nwith its extended metadata map and the list of unprocessed macro\narguments.",
   :var-type "function",
   :line 275,
   :file "src/main/clojure/clojure/tools/macro.clj"}
  {:arglists ([symbol-bindings & exprs]),
   :name "symbol-macrolet",
   :namespace "clojure.tools.macro",
   :source-url
   "https://github.com/clojure/tools.macro/blob/19c8197e10079f04e55d81c26884b9248762c2ca/src/main/clojure/clojure/tools/macro.clj#L215",
   :raw-source-url
   "https://github.com/clojure/tools.macro/raw/19c8197e10079f04e55d81c26884b9248762c2ca/src/main/clojure/clojure/tools/macro.clj",
   :wiki-url
   "http://clojure.github.com/tools.macro//clojure.tools.macro-api.html#clojure.tools.macro/symbol-macrolet",
   :doc
   "Define local symbol macros that are used in the expansion of exprs.\nThe syntax is the same as for let forms.",
   :var-type "macro",
   :line 215,
   :file "src/main/clojure/clojure/tools/macro.clj"}
  {:arglists ([& exprs]),
   :name "with-symbol-macros",
   :namespace "clojure.tools.macro",
   :source-url
   "https://github.com/clojure/tools.macro/blob/19c8197e10079f04e55d81c26884b9248762c2ca/src/main/clojure/clojure/tools/macro.clj#L234",
   :raw-source-url
   "https://github.com/clojure/tools.macro/raw/19c8197e10079f04e55d81c26884b9248762c2ca/src/main/clojure/clojure/tools/macro.clj",
   :wiki-url
   "http://clojure.github.com/tools.macro//clojure.tools.macro-api.html#clojure.tools.macro/with-symbol-macros",
   :doc "Fully expand exprs, including symbol macros.",
   :var-type "macro",
   :line 234,
   :file "src/main/clojure/clojure/tools/macro.clj"})}
