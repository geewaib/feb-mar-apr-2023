package com.herbalife.restapiinternalsday15;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the training";
    }
}
