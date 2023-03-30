package com.herbalife.moviedetailsfetcher.consumer;

import com.herbalife.moviedetailsfetcher.service.MovieDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MovieDetailsConsumer {

    @Autowired
    private MovieDetailsService movieDetailsService;

    @KafkaListener(topics = "${movie.topic}", groupId = "${movie.group}")
    public void getMovieName(String movieName) {
        movieDetailsService.fetchDetails(movieName);
    }
}
