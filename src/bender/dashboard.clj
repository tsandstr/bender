(ns bender.dashboard
  (:gen-class :name dashboard)
  (:import (edu.wpi.first.wpilibj.smartdashboard SmartDashboard)
           (edu.wpi.first.wpilibj BuiltInAccelerometer)))

(defn put-accelerometer
  []
  (SmartDashboard/putData (BuiltInAccelerometer.)))
