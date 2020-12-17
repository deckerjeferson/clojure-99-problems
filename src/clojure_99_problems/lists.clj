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

;; Problem 8
(defn same-element?
  [first-element second-element]
  (= first-element second-element))

(defn eliminate-consecutive-duplicates
  [collection]
  (if (empty? collection)
    '()
    (let [[element-1 element-2 & others] collection]
      (if (same-element? element-1 element-2)
        (eliminate-consecutive-duplicates others)
        (conj (conj (eliminate-consecutive-duplicates others) element-2) element-1)))))

(defn add-non-duplicated-element
  [result next-element]
  (if (same-element? (last result) next-element)
    result
    (conj result next-element)))

(defn eliminate-consecutive-duplicates
  [collection]
  (reduce
    add-non-duplicated-element
    []
    collection))


;; Problem 9
(defn group-same-elements-in-sublist
  [collection]
  (reduce
    (fn
      [result next-element]
      (if (empty? result)
        (conj '() (list next-element))
        (if (same-element? (last (last result)) next-element)
          (assoc result (dec(count result)) (conj (last result) next-element))
          (conj '() (list next-element)))))
    '()
    collection))