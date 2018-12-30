(ns bender.drivetrain
  (:gen-class :name drivetrain)
  (:require (bender [constants :as const]))
  (:import (edu.wpi.first.wpilibj.drive DifferentialDrive)
           (edu.wpi.first.wpilibj Spark)))

(defn make-drivetrain
  []
  (let [left (Spark. const/left-motor-channel)
        right (Spark. const/right-motor-channel)]
    (DifferentialDrive. left right)))

(defn drive
  [drivetrain velocity rotation quickturn]
  (.curvatureDrive drivetrain velocity rotation quickturn))

