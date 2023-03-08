package com.herbalife.labs.lab11;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;

public class MovieDetailsFetcher {
    private String ombdBaseUrl = "http://www.omdbapi.com/?i=tt3896198&apikey=52d1c7f&t=";
    private HttpClient httpClient = HttpClient.newBuilder().build();
    private Gson gson = new Gson();


    public boolean loadMovieDetails(List<String> movieNames) {
        Map<Boolean, List<OmdbMovieModel>> movieDetailsMap = movieNames
                .stream()
                .parallel()
                .map(this::getMovieDetailsFromOmdb)
                .collect(Collectors.groupingBy(movieModel -> movieModel.isResponse()));

        System.out.println("*****DETAILS****");
        movieDetailsMap.get(true).forEach(System.out::println);

        System.out.println("*****List of movies, that could not be fetched****");
        movieDetailsMap.get(false).forEach(System.out::println);
        return true;
    }

    private OmdbMovieModel getMovieDetailsFromOmdb(String movieName) {
        String url = ombdBaseUrl + URLEncoder.encode(movieName, Charset.defaultCharset());
        OmdbMovieModel omdbMovieModel = null;
        HttpResponse<String> response = null;
        try {
            HttpRequest request = HttpRequest
                    .newBuilder(new URI(url))
                    .GET()
                    .build();
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            String result = response.body();
            omdbMovieModel = gson.fromJson(result, OmdbMovieModel.class);
            if (!omdbMovieModel.isResponse()) {
                omdbMovieModel.setTitle(movieName);
            }

        } catch (Exception e) {
            omdbMovieModel = new OmdbMovieModel();
            omdbMovieModel.setTitle(movieName);
            omdbMovieModel.setResponse(false);
            omdbMovieModel.setReason(e.getMessage());
        }
        return omdbMovieModel;
    }
}
