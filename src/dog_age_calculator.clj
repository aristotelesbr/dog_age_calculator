(ns dog-age-calculator)

;; The first year of a dog's life is not equal to 7 human years. So we need to
;; subtract the first year of a dog's life from the dog's age, multiply it by
;; 7, and then add the first year of a dog's life back to the result.
(def first-year-dogs 1)
;; The stimated average age of dogs is 7 years to 1 human year after the first
;; year of a dog's life.
(def one-year-in-dogs-life 7)

(defn _convert-from-human-to-dogs-years
  "Converts human years to dogs years.
   The first year of a dog's life is not equal to 7 human years. So we need to
   subtract the first year of a dog's life from the dog's age, multiply it by
   7, and then add the first year of a dog's life back to the result."
  [dog-age]
  (-> (- dog-age first-year-dogs)
      (* one-year-in-dogs-life)
      (+ first-year-dogs)))

(defn _to-string
  "Outputs the dog's name and age in human years."
  [dog-name dog-age]
  (str dog-name "'s human age is " dog-age "."))

(defn _get-dog-name
  "Gets the dog's name from the user."
  []
  (println "Enter in the dog's 🐶 name: ")
  (read-line))

(defn _get-dog-age
  "Gets the dog's age from the user."
  []
  (println "Enter in the dog's 🐶 age: ")
  (. Integer parseInt (read-line)))

(defn call
  "Calls the functions to convert the dog's age to human years and outputs the
   dog's name and age in human years."
  []
  (let [dog-name (_get-dog-name)
        dog-age (_get-dog-age)]
    (->> (_convert-from-human-to-dogs-years dog-age)
         (_to-string dog-name))))
