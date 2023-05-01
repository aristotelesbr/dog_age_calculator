(ns dog-age-calculator-test
  (:require [clojure.string :as str]
            [dog-age-calculator])
  (:require [clojure.test :refer [deftest is testing]]))

(deftest _convert-from-human-to-dogs-years-8-test
  (testing "when dog is 8 year old"
    (is (= 8 (dog-age-calculator/_convert-from-human-to-dogs-years 2)))))

(deftest _convert-from-human-to-dogs-years-43-test
  (testing "when dog is 43 year old"
    (is (= 43 (dog-age-calculator/_convert-from-human-to-dogs-years 7)))))

(deftest _to-string-test
  (testing "displays the dog's name and age in human years"
    (is (= "Lolla's human age is 7." (dog-age-calculator/_to-string "Lolla" 7)))))

(deftest _get-dog-name-test
  (testing "gets the dog's name from the user"
    (with-in-str "Lolla\n"
      (with-out-str
        (binding [*in* *in*]
          (let [name (dog-age-calculator/_get-dog-name)]
            (is (= (str/trim name) "Lolla"))))))))

(deftest _get-dog-age-test
  (testing "gets the dog's age from the user"
    (with-in-str "7\n"
      (with-out-str
        (binding [*in* *in*]
          (let [age (dog-age-calculator/_get-dog-age)]
            (is (= age 7))))))))

(deftest call-test
  (testing "calls the functions to convert the dog's age to human years and outputs the dog's name and age in human years"
    (with-in-str "Lolla\n7\n"
      (with-out-str
        (binding [*in* *in*]
          (let [output (dog-age-calculator/call)]
            (is (= (str/trim output) "Lolla's human age is 43."))))))))