package com.herbalife.moreonproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @PostMapping("/{data}")
    public void postData(@PathVariable String data) {
        kafkaTemplate.send("tuesday-topic", data);
    }
}
