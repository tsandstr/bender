(ns bender.constants
  (:gen-class :name constants))

(defmacro def-const
  [const-name const-val]
  `(def
     ~(with-meta const-name
        (assoc (meta const-name) :const true))
     ~const-val))

(defmacro def-consts
  [bindings]
  `(do
     ~@(map (fn [[const-name const-val]]
              `(def-const ~const-name ~const-val))
            (partition 2 bindings))))

(def-consts
  [;; drivetrain
   left-motor-channel 0
   right-motor-channel 1
   ;;joysticks
   joystick-port 0])
