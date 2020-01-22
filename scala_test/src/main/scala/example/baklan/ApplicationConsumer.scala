package example.baklan

import org.apache.kafka.clients.consumer.KafkaConsumer
import scala.collection.JavaConverters._

object ApplicationConsumer extends App {
  val consumer = new KafkaConsumer[String, String](KafkaConfig.Properties)
  consumer.subscribe(java.util.Collections.singletonList("postgres-test_table"))

  while(true) {
    val records = consumer.poll(100)
    records.asScala.foreach(record => {
      println(s"Received record: $record")
    })
  }
}
