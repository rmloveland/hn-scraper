(ns hn-scraper.core
  (:gen-class)
  (:require [net.cgrand.enlive-html :as dom]))

;; Adapted from code at:
;; http://stackoverflow.com/questions/34687654/how-to-write-the-following-clojure-enlive-selector

(def ^:dynamic *hn-url* "https://news.ycombinator.com/classic")

(defn fetch-resource [url]
  (dom/html-resource (java.net.URL. url)))

;;; Enlive Selector Examples

;; 'tr > td:nth-child(3) > a'
;; [:tr :> [:td (dom/nth-child 3)] :> :a]

(defn scrape-hn []
  (let [resp (dom/select
              (fetch-resource *hn-url*) [:tr :> [:td (dom/nth-child 3)] :> :a])
        titles* (map :content resp)
        titles (map first titles*)]
    titles))

;;; Data structure returned in `resp`

'({:tag :a, :attrs {:href "http://www.openphilanthropy.org/focus/global-catastrophic-risks/potential-risks-advanced-artificial-intelligence/openai-general-support", :class "storylink"}, :content ("Open Philanthropy Project awards a grant of $30M to OpenAI")}
  {:tag :a, :attrs {:href "https://www.blinklight.io/blog/2017-03-31/", :class "storylink"}, :content ("Open Source Needs FPGAs; FPGAs Need an On-Ramp")}
  {:tag :a, :attrs {:href "https://blog.skyliner.io/fourteen-months-with-clojure-beb8b3e4bf00", :class "storylink"}, :content ("Fourteen Months with Clojure")})

(defn -main []
  (let [data (scrape-hn)]
    (doseq [d data]
      (println d))))
