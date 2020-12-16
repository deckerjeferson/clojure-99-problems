(ns clojure-99-problems.lists-test
  (:require [clojure.test :refer :all])
  (:require [clojure-99-problems.lists :refer :all]))

(deftest problem-1-get-last-element-from-collection
  (testing "Should get the last element from the collection"
    (is (= "d" (get-last-element ["a" "b" "c" "d"])))))

(deftest problem-2-get-last-but-one-element-from-collection
  (testing "Should get the last 2 elements from the collection"
    (is (= ["c" "d"] (get-last-but-one ["a" "b" "c" "d"])))))

(deftest problem-3-get-kth-element-from-collection
  (testing "Should get the 3 element from the collection"
    (is (= "c" (get-element-in-desired-position ["a" "b" "c" "d"] 2)))))

(deftest problem-4-get-number-elements-in-a-list
  (testing "Should find 5 as the count of a 5 elements' list"
  (is (= 5 (get-number-of-elements ["a" "b" "c" "d" "e"])))))