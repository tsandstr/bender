(ns bender.joystick
  (:gen-class :name joystick)
  (:import (edu.wpi.first.wpilibj Joystick)))

(defn make-joystick
  [port]
  (Joystick. port))
