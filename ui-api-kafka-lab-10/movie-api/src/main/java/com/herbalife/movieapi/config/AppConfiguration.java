package com.herbalife.movieapi.config;

import com.herbalife.movie.common.model.OmdbMovie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfiguration {

    @Bean
    public List<OmdbMovie> movieDetailsList() {
        return new ArrayList<>();
    }
}
