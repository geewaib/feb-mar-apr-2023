package com.herbalife.sampleproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @PostMapping("/registration")
    public String registerForTraining(@RequestParam("email") String email) {
        kafkaTemplate.send("sample-topic2", email);
        return email + " is registered. You will receive a confirmation shortly";
    }
}
