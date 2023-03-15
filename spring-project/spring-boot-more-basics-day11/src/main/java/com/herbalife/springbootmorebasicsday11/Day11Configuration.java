package com.herbalife.springbootmorebasicsday11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class Day11Configuration {

    @Bean
    public List<String> indianAuthors() {
        return Arrays.asList("Chetan", "JM");
    }

    @Bean
    public List<String> britishAuthors() {
        return Arrays.asList("JKR", "JA");
    }
}
