package com.herbalife.wordplayapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfiguration {

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        //CONFIGURE CREDENTIALS, CERTIFICATES, HEADERS etc
        return restTemplate;
    }

}
