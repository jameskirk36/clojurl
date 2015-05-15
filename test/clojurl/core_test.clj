(ns clojurl.core-test
  (:require [clojure.test :refer :all]
            [clojurl.core :as core]
            [ring.mock.request :as mock]))

(deftest acceptance-tests
  (testing "Given unknown link should return 404"
    (is (= {:status 404
            :headers {"Content-Type" "text/html; charset=utf-8"}
            :body "Not Found"}
          (core/my-handler (mock/request :get "/go/unknown_link"))))))
