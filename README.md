clojure.tools.macro
========================================

Tools for writing macros.



Releases and Dependency Information
========================================

Latest stable release: 0.1.2

* [All Released Versions](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22org.clojure%22%20AND%20a%3A%22tools.macro%22)

* [Development Snapshot Versions](https://oss.sonatype.org/index.html#nexus-search;gav~org.clojure~tools.macro~~~)

[Leiningen](https://github.com/technomancy/leiningen) dependency information:

    [org.clojure/tools.macro "0.1.2"]

[Maven](http://maven.apache.org/) dependency information:

    <dependency>
      <groupId>org.clojure</groupId>
      <artifactId>tools.macro</artifactId>
      <version>0.1.2</version>
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

* [Bug Tracker](http://dev.clojure.org/jira/browse/TMACRO)

* [Continuous Integration](http://build.clojure.org/job/tools.macro/)

* [Compatibility Test Matrix](http://build.clojure.org/job/tools.macro-test-matrix/)



Change Log
====================

* Release 0.1.2 on 2012.02.18
  *  Protect symbols bound by let and letfn against macroexpansion from an outer scope
* Release 0.1.1 on 2011.05.26
  * Added `name-with-attributes`
* Release 0.1.0 on 2011.05.04
  * Version imported from old contrib



Copyright and License
========================================

Copyright (c) 2011 Rich Hickey. All rights reserved.  The use and distribution terms for this software are covered by the Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php) which can be found in the file epl-v10.html at the root of this distribution. By using this software in any fashion, you are agreeing to be bound bythe terms of this license.  You must not remove this notice, or any other, from this software.
