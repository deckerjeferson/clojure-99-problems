(ns clojure-99-problems.lists)


;; Problem 1
(defn get-last-element
  "Get last element from a collection"
  [collection]
  (let [element (first collection)
        others (rest collection)]
    (if (empty? others)
      element
      (recur others))))

;; Problem 2
(defn get-last-but-one
  [[first second & others]]
  (if (empty? others)
    (seq [first second])
    (recur others)))

;; Problem 3
(defn get-element-in-desired-position
  [collection number-of-desired-element]
  (if (= number-of-desired-element 0)
    (first collection)
    (recur (rest collection) (dec number-of-desired-element))))

;;Problem 4
(defn get-number-of-elements
  [collection]
  (reduce + (map (constantly 1) collection)))

;; Problem 5
(defn reverse-list
  [collection]
  (reduce #(conj %1 %2) '() collection))

;; Problem 6
(defn palindrome?
  [collection]
  (= collection (reverse-list collection)))

;;Problem 7
(defn flat-collection
  [collection]
  (if (empty? collection)
    '()
    (let [[first & others] collection]
      (if (vector? first)
        (concat (flat-collection first) (flat-collection others))
        (conj (flat-collection others) first)))))