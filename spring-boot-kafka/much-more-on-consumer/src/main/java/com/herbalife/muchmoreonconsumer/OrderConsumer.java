package com.herbalife.muchmoreonconsumer;

import com.herbalife.muchmoreonproducer.Order;
import org.springframework.kafka.annotation.DltHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.messaging.Message;
import org.springframework.retry.annotation.Backoff;
import org.springframework.stereotype.Component;

@Component
public class OrderConsumer {
    //dlt - dead letter topic
    @RetryableTopic(attempts = "5", backoff = @Backoff(delay = 1000, multiplier = 2.0))
    @KafkaListener(topics = "orders-topic", groupId = "orders-consumer-group-1")
    public void processOrder(Order order) {
        if(order.getQuantity() > 100) {
            throw new RuntimeException("Throwing a silly error to demo retry");
        }
        System.out.println("Received " + order);
    }

    @DltHandler
    public void deadLetterTopic(Message<Order> orderMessage) {
        System.out.println("*******Failed to process " + orderMessage);
        System.out.println("Pushed to dead letter topic");
    }

//    @KafkaListener(topics = "orders-topic", groupId = "orders-consumer-group-1")
//    public void processOrder(Order order) {
//        System.out.println("Received " + order);
//    }
}
