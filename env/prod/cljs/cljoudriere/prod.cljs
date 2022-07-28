(ns cljoudriere.prod
  (:require [cljoudriere.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
