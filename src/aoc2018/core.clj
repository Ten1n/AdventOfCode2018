(ns aoc2018.core
  (:gen-class)
  (:require [aoc2018.aoc8 :refer :all]))

(defn -main
  "Run solutions code"
  [& args]
  (println (solve2 (slurp "resources\\8.txt"))))
