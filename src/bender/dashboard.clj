(ns bender.dashboard
  (:gen-class :name dashboard)
  (:import (edu.wpi.first.wpilibj.shuffleboard Shuffleboard)
           (edu.wpi.first.wpilibj BuiltInAccelerometer)))

(declare sensors-tab)

(defn put-accelerometer
  []
  (.add (sensors-tab) "Accelerometer" (BuiltInAccelerometer.)))

(defn- sensors-tab
  []
  (Shuffleboard/getTab "Sensors"))
