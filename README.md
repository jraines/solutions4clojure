# solutions4clojure

## Usage

`lein repl`

`(test-run)`

If you make changes: `(refresh)`

`test-run` implementation:

```clojure
(defn test-run []
  (doseq [n test-namespaces]
    (require n))
  (apply run-tests test-namespaces))
```
