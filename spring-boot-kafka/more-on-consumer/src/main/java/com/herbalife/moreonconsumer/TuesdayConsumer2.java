package com.herbalife.moreonconsumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TuesdayConsumer2 {

    @KafkaListener(topics = "tuesday-topic", groupId = "tuesday-topic-consumer-group-local8", concurrency = "2")
    public void process1(ConsumerRecord record) {
        String message = "Data: " + record.value().toString();
        message += ", Topic: " + record.topic();
        message += ", Partition: " + record.partition();
        System.out.println("I************ " + message + " on " + Thread.currentThread().getName());
    }
    @KafkaListener(topics = "tuesday-topic", groupId = "tuesday-topic-consumer-group-local8", concurrency = "2")
    public void process2(ConsumerRecord record) {
        String message = "Data: " + record.value().toString();
        message += ", Topic: " + record.topic();
        message += ", Partition: " + record.partition();
        System.out.println("II************ " + message + " on " + Thread.currentThread().getName());
    }
    @KafkaListener(topics = "tuesday-topic", groupId = "tuesday-topic-consumer-group-local8", concurrency = "2")
    public void process3(ConsumerRecord record) {
        String message = "Data: " + record.value().toString();
        message += ", Topic: " + record.topic();
        message += ", Partition: " + record.partition();
        System.out.println("III************ " + message + " on " + Thread.currentThread().getName());
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
