(ns solutions4clojure.ex95)

(defn is-tree? [v]
  (or (nil? v)
      (and (coll? v)
           (= 3 (count v))
           (not (coll? (first v))) ;; why not? maybe val could be a seq
           (is-tree? (second v))
           (is-tree? (last v)))))
