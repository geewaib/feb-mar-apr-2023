package com.herbalife.moviedetailsfetcher.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.Charset;

@Service
public class MovieService {
    @Value("${omdb.base.url}")
    private String omdbBaseUrl;

    @Autowired
    private HttpClient httpClient;

    public String fetchDetails(String movieTitle) {
        String result = null;
        String url = omdbBaseUrl + URLEncoder.encode(movieTitle, Charset.defaultCharset());
        HttpResponse<String> response = null;
        try {
            HttpRequest request = HttpRequest
                    .newBuilder(new URI(url))
                    .GET()
                    .build();
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            result = response.body();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
