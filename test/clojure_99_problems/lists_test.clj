(ns clojure-99-problems.lists-test
  (:require [clojure.test :refer :all])
  (:require [clojure-99-problems.lists :refer :all]))

(deftest problem-1-get-last-element-from-collection
  (testing "get last element from collection"
    (is (= (get-last-element ["a" "b" "c" "d"]) "d"))))
