(defproject hn-scraper "0.1.0-SNAPSHOT"
  :description "Scrape stories from the HN frontpage"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/tools.nrepl "0.2.12"]
                 [clj-http "2.3.0"]
                 [enlive "1.1.6"]]
  :main hn-scraper.core
  :aot [hn-scraper.core])
