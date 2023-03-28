package com.herbalife.movieproducerapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Value("${movie.topic}")
    private String movieTopic;

    public void process(String movieTitle) {
        kafkaTemplate.send(movieTopic, movieTitle);
    }
}
