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

;; Problem 3
(defn get-element-in-desired-position
  [collection number-of-desired-element]
  (nth collection number-of-desired-element))

;;Problem 4
(defn get-number-of-elements
  [collection]
  (count collection))

;; Problem 5
(defn reverse-list
  [collection]
  (reverse collection))

;; Problem 6
(defn palindrome?
  [collection]
  (= collection (reverse collection)))




