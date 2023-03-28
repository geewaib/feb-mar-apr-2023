package com.herbalife.movieproducerapi.controller;

import com.herbalife.movieproducerapi.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @Autowired
    private MovieService movieService;

    @PostMapping("/movies/{movieTitle}")
    public String postMovieForDetails(@PathVariable String movieTitle) {
        movieService.process(movieTitle);
        return movieTitle + " sent for processing";
    }
}
