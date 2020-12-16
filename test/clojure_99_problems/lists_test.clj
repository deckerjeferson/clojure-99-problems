(ns clojure-99-problems.lists-test
  (:require [clojure.test :refer :all])
  (:require [clojure-99-problems.lists :refer :all]))

(deftest problem-1-get-last-element-from-collection
  (testing "Should get the last element from the collection"
    (is (= (get-last-element ["a" "b" "c" "d"]) "d"))))

(deftest problem-2-get-last-but-one-element-from-collection
  (testing "Should get the last 2 elements from the collection"
    (is (= (get-last-but-one ["a" "b" "c" "d"]) ["c" "d"]))))

