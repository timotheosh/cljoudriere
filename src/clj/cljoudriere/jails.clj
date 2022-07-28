(ns cljoudriere.jails
  (:require [clojure.java.shell :refer [sh]]))

(defn on-path? [program]
  (let [results (sh "which" program)]
    (if (zero? (:exit results))
      true
      {:error (str program " not found!")})))
