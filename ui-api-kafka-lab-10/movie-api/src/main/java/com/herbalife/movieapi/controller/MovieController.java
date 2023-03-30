package com.herbalife.movieapi.controller;

import com.herbalife.movie.common.model.OmdbMovie;
import com.herbalife.movieapi.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
@CrossOrigin(origins = "*")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @Autowired
    private List<OmdbMovie> movieDetailsList;

    @PostMapping("/{movieName}")
    public HttpEntity<String> postMovieIntoMom(@PathVariable String movieName) {
        movieService.pushToMom(movieName);
        String message = "You will get the details of " + movieName + " shortly";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/{movieName}")
    public OmdbMovie getMovieDetails(@PathVariable String movieName) {
        return movieDetailsList
                .stream()
                .filter(movie -> movie.getTitle().equalsIgnoreCase(movieName))
                .findFirst()
                .orElseThrow(() -> new RuntimeException(movieName + " is not found"));
    }
}
