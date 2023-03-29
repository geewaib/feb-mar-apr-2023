package com.herbalife.muchmoreonproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;

    @PostMapping
    public void createOrder(@RequestBody Order order) {
        kafkaTemplate.send("orders-topic", "order-key", order);
    }

}
