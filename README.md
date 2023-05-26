clojure.tools.macro
========================================

Tools for writing macros.



Releases and Dependency Information
========================================

Latest stable release: 0.1.5

* [All Released Versions](https://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22org.clojure%22%20AND%20a%3A%22tools.macro%22)

* [Development Snapshot Versions](https://oss.sonatype.org/index.html#nexus-search;gav~org.clojure~tools.macro~~~)

[CLI/`deps.edn`](https://clojure.org/reference/deps_and_cli) dependency information:
```clojure
org.clojure/tools.macro {:mvn/version "0.1.5"}
```

[Leiningen](https://github.com/technomancy/leiningen) dependency information:

    [org.clojure/tools.macro "0.1.5"]

[Maven](https://maven.apache.org/) dependency information:

    <dependency>
      <groupId>org.clojure</groupId>
      <artifactId>tools.macro</artifactId>
      <version>0.1.5</version>
    </dependency>



Example Usages
========================================

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



Developer Information
========================================

* [GitHub project](https://github.com/clojure/tools.macro)
* [Bug Tracker](https://clojure.atlassian.net/browse/TMACRO)
* [Continuous Integration](https://github.com/clojure/tools.macro/actions/workflows/test.yml)



Change Log
====================

* Release 0.1.5 on 2013.09.12
  * Fix macroexpansion of methods in deftype\* and reify\*
  * Allow only non-qualified symbols in macrolet and symbol-macrolet
  * Fix bug that caused overlooking local macro definitions
* Release 0.1.4 on 2013.09.07
  * Fix compatibility issue for Clojure 1.3/1.4
* Release 0.1.2 on 2012.02.18
  *  Protect symbols bound by let and letfn against macroexpansion from an outer scope
* Release 0.1.1 on 2011.05.26
  * Added `name-with-attributes`
* Release 0.1.0 on 2011.05.04
  * Version imported from old contrib



Copyright and License
========================================

Copyright (c) 2011-2023 Rich Hickey. All rights reserved.  The use and distribution terms for this software are covered by the Eclipse Public License 1.0 (https://opensource.org/licenses/eclipse-1.0.php) which can be found in the file epl-v10.html at the root of this distribution. By using this software in any fashion, you are agreeing to be bound bythe terms of this license.  You must not remove this notice, or any other, from this software.
