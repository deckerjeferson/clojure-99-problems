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

(deftest problem-5-reverse-the-list
  (testing "Should return [e d c b a] when reversing the list"
    (is (= ["e" "d" "c" "b" "a"] (reverse-list ["a" "b" "c" "d" "e"])))))

(deftest problem-6-verify-if-the-list-is-a-palindrome
  (let [palindrome ["x" "a" "n" "a" "x"]
        not-palindrome ["o" "i"]]
    (testing "Should verify that [x a n a x] is a palindrome"
      (is (= true (palindrome? palindrome))))
    (testing "Should verify that [o i] is not a palindrome"
      (is (= false (palindrome?  not-palindrome))))))

(deftest problem-7-flatten-nested-vector-structure
  (testing "Should return [A B C D E] to vector [ A [ B [ C [ D E ]]]]"
    (let [nested-list ["A" ["B" ["C" ["D" "E"]]]]]
      (is (= (seq ["A" "B" "C" "D" "E"]) (flat-collection nested-list))))))

(deftest problem-8-eliminate-consecutive-duplicates-in-a-list-of-elements
  (testing "Should return (A B C A D E) when list is '(a a a a b c c a a d e e e e)"
    (let [duplicated-elements-list (list "a" "a" "a" "a" "b" "c" "c" "a" "a" "d" "e" "e" "e" "e")]
      (is (= '("a" "b" "c" "a" "d" "e") (eliminate-consecutive-duplicates duplicated-elements-list))))))

(deftest problem-9-group-same-elements-in-sublists
  (testing "Should return ((A A A A) (B) (C C) (A A) (D) (E E E E) when list is '(a a a a b c c a a d e e e e))"
    (let [duplicated-elements-list (list "a" "a" "a" "a" "b" "c" "c" "a" "a" "d" "e" "e" "e" "e")]
      (is (= (list (list "a" "a" "a" "a") (list "b") (list "c" "c") (list "d") (list "e" "e" "e" "e")) (group-same-elements-in-sublist duplicated-elements-list))))))