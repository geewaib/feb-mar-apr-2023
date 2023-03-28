package com.herbalife.moreonproducer;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @PostMapping("/{data}")
    public void postData(@PathVariable String data) {

    }
}
