(ns meiro.binary-tree-test
  (:require [clojure.test :refer [deftest testing is]]
            [meiro.core :as m]
            [meiro.binary-tree :as bt]
            [meiro.dijkstra :as d]))


(deftest create-test
  (testing "Ensure all cells are linked."
    (is (every? #(not-any? empty? %) (bt/create (m/init 10 12)))))
  (testing "Resuling maze is perfect."
    (let [maze (bt/create (m/init 15 15))]
      (is (d/solution maze [0 0] [14 14]))
      (is (d/solution maze (m/random-pos maze) (m/random-pos maze))))))
