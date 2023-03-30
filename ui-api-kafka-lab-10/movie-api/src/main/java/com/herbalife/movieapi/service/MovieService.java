package com.herbalife.movieapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${movie.topic}")
    private String movieTopic;

    public void pushToMom(String movieName) {
        kafkaTemplate.send(movieTopic, movieName);
    }
}
