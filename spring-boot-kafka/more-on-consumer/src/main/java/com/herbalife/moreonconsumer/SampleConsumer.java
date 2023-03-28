package com.herbalife.moreonconsumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.stereotype.Component;

@Component
public class SampleConsumer {

    @KafkaListener(topics = "tuesday-topic", groupId = "tuesday-topic-consumer-group-1")
    public void process1(ConsumerRecord record) {
        String data = record.value().toString();
        System.out.println("Topic: " + record.topic());
        System.out.println("Offset: " + record.offset());
        record.headers().forEach(header -> {
            System.out.println(header.key() + ": " + new String(header.value()));
        });
        System.out.println("********Consumer 1: " + data + " from partition: " + record.partition());
    }

    @KafkaListener(topics = "tuesday-topic", groupId = "tuesday-topic-consumer-group-1")
    public void process2(String data) {
        System.out.println("********Consumer 2: " + data);
    }

    @KafkaListener(topics = "tuesday-topic", groupId = "tuesday-topic-consumer-group-1")
    public void process3(String data) {
        System.out.println("********Consumer 3: " + data);
    }

    @KafkaListener(topics = "tuesday-topic", groupId = "tuesday-topic-consumer-group-1")
    public void process4(String data) {
        System.out.println("********Consumer 4: " + data);
    }

}
