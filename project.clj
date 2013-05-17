(defproject infer "1.1-SNAPSHOT"
  :min-lein-version "2.0.0"
  :description "inference and machine learning for clojure"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [clojure-csv "2.0.0-alpha2" :exclude org.clojure/clojure]
                 [org.apache.commons/commons-math "2.2"]
                 [ujmp-complete "0.2.4"]
		 [org.apache.mahout/mahout-core "0.3"]
		 [colt/colt "1.2.0"]
                 [net.sourceforge.parallelcolt/parallelcolt "0.10.0"]
                 [org.clojure/algo.monads "0.1.4" :exclude org.clojure/clojure]
                 [org.clojure/math.combinatorics "0.0.4"]
                 [org.clojure/math.numeric-tower "0.0.2"]
                 [org.clojure/algo.generic "0.1.1"]
                 ]
  :java-source-paths ["src/jvm"]
  :jvm-opts ["-Xmx512m"]
  )
