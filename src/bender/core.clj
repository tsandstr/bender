(ns bender.core
  (:gen-class)
  (:require (bender [robot :as robot]))
  (:import (edu.wpi.first.wpilibj RobotBase)))

(defn -main
  [& args]
  (RobotBase/startRobot (robot/robot-supplier)))
