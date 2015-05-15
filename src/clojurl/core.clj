(ns clojurl.core
  (use compojure.core)
  (:require [compojure.route :as route]))

(defroutes my-handler
  (route/not-found "Not Found"))

