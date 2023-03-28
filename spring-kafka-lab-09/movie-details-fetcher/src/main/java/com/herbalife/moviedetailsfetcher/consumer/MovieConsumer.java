package com.herbalife.moviedetailsfetcher.consumer;

import com.herbalife.moviedetailsfetcher.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MovieConsumer {

    @Autowired
    private MovieService movieService;

    @KafkaListener(topics = "${movie.topic}", groupId = "${movie.consumer.group}")
    public void processMovie(String movieTitle) {
        System.out.println("****Fetching details for " + movieTitle);
        String details = movieService.fetchDetails(movieTitle);
        System.out.println(details);
    }
}
