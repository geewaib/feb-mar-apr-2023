package com.herbalife.moviedetailsfetcher.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.http.HttpClient;

@Configuration
public class AppConfiguration {

    @Bean
    public HttpClient httpClient() {
        return HttpClient
                .newBuilder()
                .build();
    }
}
