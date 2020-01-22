package example.baklan

import java.util.Properties

object KafkaConfig {
  val Properties = new Properties()
  val TopicName = "pg_logs"
  Properties.put("bootstrap.servers", "localhost:9092")
  Properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
  Properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")
  Properties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
  Properties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
  Properties.put("group.id", "test")
}
