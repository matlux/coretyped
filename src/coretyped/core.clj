(ns coretyped.core
  (:require [clojure.core.typed :refer [ann ann-form AnyInteger check-ns cf]])
  (:import [clojure.lang ISeq]))

;;(ann ^:no-check clojure.core/mod [AnyInteger AnyInteger -> AnyInteger])


(ann div-by [AnyInteger AnyInteger -> Boolean])
(defn div-by [x y]
  (== (mod y x) 0))

 ;; (cf (defn div-by2 [x y]
 ;;   (== (mod y x) 0)))

(ann addit [(U Integer Double) Double -> Number])
(defn addit [a b]
  (+ a b))
;; (ann trytodiv [String -> Boolean])
;; (defn trytodiv [a]
;;   (div-by a 2) )


;; (ann trytodiv2 [AnyInteger -> Boolean])
;; (defn trytodiv2 [a]
;;   (div-by a (eval "b")) )

;; (ann trytodiv3 [String -> Boolean])
;; (defn trytodiv3 [a]
;;   (div-by a 3) )

;; (ann trytodiv4 [AnyInteger -> Boolean])
;; (defn trytodiv4 [^String a]
;;   (div-by a 3) )

;;(trytodiv4 2)



;; (ann -main [-> nil])
;; (defn -main []
;;   (println "helloworld"))

(comment
(check-ns)
)
