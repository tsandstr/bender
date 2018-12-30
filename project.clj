(require 'cemerick.pomegranate.aether)
(cemerick.pomegranate.aether/register-wagon-factory!
 "http" #(org.apache.maven.wagon.providers.http.HttpWagon.))

(defproject bender "0.1.0-SNAPSHOT"
  :description "The code for Bender, an imaginary FRC robot."
  :url "https://github.com/tsandstr/bender"
  :license {:name "GPLv3.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :repositories [["first" "http://first.wpi.edu/FRC/roborio/maven/development/"]]
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [edu.wpi.first.wpilibj/wpilibj-java "2019.1.1-beta-4-17-g300eeb3"]
                 [edu.wpi.first.ntcore/ntcore-java "2019.1.1-beta-4-21-g01d1322"]
                 [edu.wpi.first.cameraserver/cameraserver-java "2019.1.1-beta-4-21-g01d1322"]]
  :main ^:skip-aot bender.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
