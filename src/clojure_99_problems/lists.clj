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
;;; Problem 5
;(defn reverse-list
;  [collection]
;  (reverse collection))
;
;;; Problem 6
;(defn palindrome?
;  [collection]
;  (= collection (reverse collection)))
;
;;;Problem 7
;(defn flat-element
;  [element]
;  (conj [] (take (count element) element)))
;
;
;(defn flat-collection
;  [collection]
;  (let [first-element (first collection)
;        others (rest collection)]
;    (if (empty? others)
;      (println "ACABOU")
;      (do (println first-element)
;          (flat-collection others)))))
;
;(defn flat-collection
;  [collection]
;  (let [first-element (first collection)
;        others (rest collection)]
;    (if (not (empty? first-element))
;      (do
;        (println "first" first-element)
;        (println "others" others)
;        (flat-collection others)))))
;
;(flat-collection ["A" ["B" ["C" ["D" "E"]]]])



  ;["A" ["B" ["C" ["D" "E"]]]]




