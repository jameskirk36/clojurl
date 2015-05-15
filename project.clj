(defproject clojurl "0.1.0-SNAPSHOT"
  :description "URL link shortener"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src"]
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.3.4"]
                 [ring/ring-core "1.3.2"]
                 [ring/ring-mock "0.2.0"]]
  :plugins [[venantius/ultra "0.3.3"]
            [lein-ring "0.9.3"]]
  :ultra {:color-scheme :solarized_dark}
  :ring  {:handler clojurl.core/app}
  :min-lein-version "2.0.0")
