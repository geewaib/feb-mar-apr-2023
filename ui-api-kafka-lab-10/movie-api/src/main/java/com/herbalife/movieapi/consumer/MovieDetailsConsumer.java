package com.herbalife.movieapi.consumer;

import com.herbalife.movie.common.model.OmdbMovie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MovieDetailsConsumer {

    @Autowired
    private List<OmdbMovie> movieDetailsList;

    @KafkaListener(topics = "${movie.details.topic}", groupId = "${movie.details.group}")
    public void processMovieDetails(OmdbMovie omdbMovie) {
        //You can store it in DB
        //For now let's maintain it locally
        movieDetailsList.add(omdbMovie);
    }
}
