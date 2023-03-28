package com.herbalife.sampleconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class SampleConsumer2 {


    @KafkaListener(topics = "sample-topic", groupId = "sample-consumer-group-local")
    public void process1(String email) {
        System.out.println("****Process1 " + email);
    }

    @KafkaListener(topics = "sample-topic", groupId = "sample-consumer-group-local")
    public void process2(String email) {
        System.out.println("****Process2 " + email);
    }

    @KafkaListener(topics = "sample-topic", groupId = "sample-consumer-group-local")
    public void process3(String email) {
        System.out.println("****Process3 " + email);
    }

}
