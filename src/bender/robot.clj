(ns bender.robot
  (:gen-class :name robot
              :extends edu.wpi.first.wpilibj.IterativeRobot)
  (:require (bender [constants :as const]
                    [dashboard :as dash]
                    [drivetrain :as drivetrain]
                    [joystick :as joystick])))

(declare drive)

(defn -robotInit
  [this]
  (def stick (joystick/make-joystick const/joystick-port))
  (def drivetrain (drivetrain/make-drivetrain))

  (dash/put-accelerometer))  

(defn -teleopPeriodic
  [this]
  (drive)
  )

(defn -autonomousInit
  [this]
  )

(defn -autonomousPeriodic
  [this]
  (drivetrain/drive drivetrain
                    0
                    1
                    true))

(defn- drive
  []
  (let [velocity (.getY stick)
        rotation (.getX stick)]
    (drivetrain/drive drivetrain
                      velocity
                      rotation
                      (< velocity 0.1))))

(defn robot-supplier
  []
  (reify java.util.function.Supplier
    (get [this] (robot.))))
