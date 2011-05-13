# tools.macro

Tools for writing macros

#### macrolet: local macro definitions ####

Example:

    (macrolet [(foo [form] `(~form ~form))]
      (foo x))

expands to `(x x)`

#### symbol-macrolet: local symbol macro definitions ####

Example:

    (symbol-macrolet [def foo]
      (def def def))

expands to `(def def foo)`

#### defsymbolmacro, with-symbol-macros: global symbol macro definitions ####

Example:

    (defsymbolmacro sum-2-3 (plus 2 3))
    (with-symbol-macros
      (+ 1 sum-2-3))

expands to `(+ 1 (plus 2 3))`

####  mexpand-1  ####

like clojure.core/macroexpand-1, but handles symbol macros

#### mexpand ####

like clojure.core/macroexpand, but handles symbol macros 

#### mexpand-all ####

full recursive macro expansion 

#### name-with-attributes ####

For writing def-like macros. Handles optional docstrings and attribute
maps for a name to be defined in a list of macro arguments.

## License

Copyright © 2011 Rich Hickey

Licensed under the EPL. (See the file epl.html.)
