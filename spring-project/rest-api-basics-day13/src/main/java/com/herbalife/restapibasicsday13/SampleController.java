package com.herbalife.restapibasicsday13;

import org.springframework.web.bind.annotation.*;

@RestController
public class SampleController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Spring boot REST API";
    }

    //http://localhost:8080/welcome/Sam -> Hello Sam
    @GetMapping("/welcome/{name}")
    public String hello(@PathVariable("name") String name) {
        return "Hello " + name;
    }

    //http://localhost:8080/welcome?name=Sam -> Hi Sam
    @PostMapping("/welcome")
    public String hi(@RequestParam("name") String name) {
        return "Hi " + name;
    }

    @GetMapping("/welcome/{firstName}/{lastName}")
    public String greet(@PathVariable("firstName") String firstName, @PathVariable("lastName")String lastName) {
        return "Hi " + firstName + " " + lastName;
    }


}
