(defproject clj-kafka.franzy/admin "0.0.0"
  :description "A Kafka Clojure Admin client, with support for topic, partition, group, cluster management, and more."
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [prismatic/schema "1.1.0"]
                 [org.apache.kafka/kafka_2.11 "0.11.0.0" :exclusions [org.scala-lang/scala-library]]
                 [org.scala-lang/scala-library "2.11.8"]
                 [clj-kafka.franzy/common nil]
                 [com.taoensso/timbre "4.3.1"]]
  :monolith/inherit true
  :middleware [leiningen.v/dependency-version-from-scm
               leiningen.v/version-from-scm
               leiningen.v/add-workspace-data]

  :plugins
  [[lein-monolith "1.0.1"]
   [com.roomkey/lein-v "6.2.0"]]
  :profiles {:dev              {:dependencies [[midje "1.7.0"]
                                               [jarohen/nomad "0.7.2"]]
                                :resource-paths ["test-resources"]
                                :plugins      [[lein-midje "3.2"]]}
             :reflection-check {:global-vars
                                {*warn-on-reflection* true
                                 *assert*             false
                                 *unchecked-math*     :warn-on-boxed}}})
