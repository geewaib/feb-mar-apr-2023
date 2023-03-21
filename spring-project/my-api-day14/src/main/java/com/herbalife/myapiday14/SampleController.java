package com.herbalife.myapiday14;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/welcome/{name}")
    public String welcome(@PathVariable String name) {
        return "Welcome " + name;
    }

}
