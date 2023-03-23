package com.herbalife.wordplayapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WordPlayService {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${palindrome.service.host}")
    private String palindromeServiceHost;

    @Value("${palindrome.service.port}")
    private int palindromeServicePort;

    public boolean checkPalindrome(String word) {
        String url = "http://" + palindromeServiceHost + ":" + palindromeServicePort + "/palindrome/" + word;
        ResponseEntity<Boolean> responseEntity = restTemplate.getForEntity(url, Boolean.class);
        return responseEntity.getBody();
    }
}
