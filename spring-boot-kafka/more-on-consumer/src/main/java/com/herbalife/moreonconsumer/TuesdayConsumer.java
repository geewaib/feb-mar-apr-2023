package com.herbalife.moreonconsumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Component
public class TuesdayConsumer {

    @KafkaListener(topics = "tuesday-topic", groupId = "tuesday-topic-consumer-group-local2")
    public void process1(ConsumerRecord record) {
        String data = record.value().toString();
        System.out.println("************Processing " + data + " with key: " + record.key().toString());
        System.out.println("Topic: " + record.topic());
        System.out.println("Partition: " + record.partition());
        System.out.println("Offset: " + record.offset());
    }


//    @KafkaListener(groupId = "tuesday-topic-consumer-group-local", topicPartitions = {
//            @TopicPartition(topic = "tuesday-topic", partitions = "0")
//    })
//    public void process1(ConsumerRecord record) {
//        String data = record.value().toString();
//        System.out.println("************Processing " + data + " with key: " + record.key().toString());
//        System.out.println("Topic: " + record.topic());
//        System.out.println("Partition: " + record.partition());
//        System.out.println("Offset: " + record.offset());
//    }


//    @KafkaListener(topics = "tuesday-topic", groupId = "tuesday-topic-consumer-group-local")
//    public void process1(ConsumerRecord record) {
//        String data = record.value().toString();
//        System.out.println("************Processing " + data);
//        System.out.println("Topic: " + record.topic());
//        System.out.println("Partition: " + record.partition());
//        System.out.println("Offset: " + record.offset());
//    }

}
