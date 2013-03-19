(defproject gripes "1.0.0-SNAPSHOT"
  :description "Gripes Application - complaints from social media"
  :repositories {"opennlp.sf.net" "http://opennlp.sourceforge.net/maven2"}
  :dev-dependencies [[lein-ring "0.8.3"]
                     [uk.org.alenscience/leiningen-war "0.0.13"]]
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/tools.logging "0.2.6"]
                 [clojure-opennlp "0.2.0"]
                 [liberator "0.8.0"]]

  )
