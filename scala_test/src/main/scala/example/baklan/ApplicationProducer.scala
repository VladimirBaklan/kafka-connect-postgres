package example.baklan

import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord, RecordMetadata}

object ApplicationProducer extends App {
  val producer = new KafkaProducer[String, String](KafkaConfig.Properties)

  val records = (1 to 10)
    .map(recordKey => new ProducerRecord[String, String](KafkaConfig.TopicName, recordKey.toString, s"value: $recordKey"))

  records.foreach(record => {
    producer.send(record, (metadata: RecordMetadata, exception: Exception) => println(s"Exception: $exception, metadata: $metadata"))
    println(s"Recond $record sent")
    Thread.sleep(100)
  })
  producer.close()
}
