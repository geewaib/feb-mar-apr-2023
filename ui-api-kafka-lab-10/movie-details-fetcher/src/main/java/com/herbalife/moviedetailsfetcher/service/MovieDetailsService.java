package com.herbalife.moviedetailsfetcher.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.herbalife.movie.common.model.OmdbMovie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.Charset;

@Service
public class MovieDetailsService {

    @Autowired
    private KafkaTemplate<String, OmdbMovie> kafkaTemplate;

    @Value("${omdb.base.url}")
    private String omdbBaseUrl;

    @Value("${movie.details.topic}")
    private String movieDetailsTopic;

    @Autowired
    private HttpClient httpClient;

    private ObjectMapper objectMapper = new ObjectMapper();

    public void fetchDetails(String movieTitle) {
        String url = omdbBaseUrl + URLEncoder.encode(movieTitle, Charset.defaultCharset());
        HttpResponse<String> response = null;
        try {
            HttpRequest request = HttpRequest
                    .newBuilder(new URI(url))
                    .GET()
                    .build();
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            String result = response.body();
            OmdbMovie omdbMovie = objectMapper.readValue(result, OmdbMovie.class);
            kafkaTemplate.send(movieDetailsTopic, omdbMovie);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
