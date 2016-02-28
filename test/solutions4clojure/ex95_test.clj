(ns solutions4clojure.ex95-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.ex95 :refer :all]))

(deftest all
  (do
    (is (= (is-tree? '(:a (:b nil nil) nil))
           true))

    (is (= (is-tree? '(:a (:b nil nil)))
           false))

    (is (= (is-tree? [1 nil [2 [3 nil nil] [4 nil nil]]])
           true))

    (is (= (is-tree? [1 [2 nil nil] [3 nil nil] [4 nil nil]])
           false))

    (is (= (is-tree? [1 [2 [3 [4 nil nil] nil] nil] nil])
           true))

    (is (= (is-tree? [1 [2 [3 [4 false nil] nil] nil] nil])
           false))

    (is (= (is-tree? '(:a nil ()))
           false))))

(defn run []
  (run-tests 'solutions4clojure.ex95-test))
