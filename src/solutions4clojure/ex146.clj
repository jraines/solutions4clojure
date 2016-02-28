(ns solutions4clojure.ex146)

(defn walkmap [m]
  (into {} (for [[k v] m
                 [k2 v2] v]
             [[k k2] v2])))
