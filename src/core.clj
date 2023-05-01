(ns core
  (:require [dog-age-calculator :as dogs-years-old]))

(defn -main
  []
  (-> (dogs-years-old/call)
      (println)))
