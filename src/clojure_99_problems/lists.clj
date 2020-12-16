(ns clojure-99-problems.lists)


;; Problem 1
(defn get-last-element
  "Get last element from a collection"
  [collection]
  (last collection))

;; Problem 2
(defn get-last-but-one
  [collection]
  (conj (take-last 2 collection)))



