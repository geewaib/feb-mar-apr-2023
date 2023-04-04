package com.herbalife.oauthsecuredapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Spring boot";
    }
}
