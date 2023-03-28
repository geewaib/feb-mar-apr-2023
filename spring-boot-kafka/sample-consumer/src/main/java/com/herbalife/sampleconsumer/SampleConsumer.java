package com.herbalife.sampleconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

//@Component
public class SampleConsumer {

//    @KafkaListener(topics = "sample-topic", groupId = "sample-consumer-group-1")
//    public void receiveEmail(String email) {
//        System.out.println("****Received " + email);
//    }

    @KafkaListener(topics = "sample-topic", groupId = "sample-consumer-group-db")
    public void processEmailAndStoreInDB(String email) {
        System.out.println("****Storing in DB " + email);
    }

    @KafkaListener(topics = "sample-topic", groupId = "sample-consumer-group-reports")
    public void generateReports(String email) {
        System.out.println("****Generating Reports " + email);
    }

    @KafkaListener(topics = "sample-topic", groupId = "sample-consumer-group-charts")
    public void generateCharts(String email) {
        System.out.println("****Generating Charts " + email);
    }

}
