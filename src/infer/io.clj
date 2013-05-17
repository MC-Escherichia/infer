(ns infer.io
  (:use clojure.java.io
        clojure-csv.core ;; TODO: change to data.csv?
        infer.matrix))

(defn csv->matrix [path]
  (let [strings (parse-csv (slurp path))]
    (matrix (for [row strings
		  :when (not (some #(= "" %) row))]
		   (map #(Float/parseFloat  %) row)))))
