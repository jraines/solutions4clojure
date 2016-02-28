(ns user
  (:require [clojure.tools.namespace.repl :refer [refresh]]
            [clojure.test :refer [run-tests]]))

(def test-namespaces
  ['solutions4clojure.ex95-test
   'solutions4clojure.ex146-test])

(defn test-run []
  (doseq [n test-namespaces]
    (require n))
  (apply run-tests test-namespaces))
