package com.herbalife.springbootutapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SampleController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/registration")
    public void register(@RequestParam String email) {
        boolean registered = registrationService.register(email);
        if(!registered) {
            throw new RuntimeException("Cannot register " + email);
        }
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }

    @GetMapping("/hello/{name}")
    public String greet(@PathVariable String name) {
        return "Hello " + name;
    }

    @PostMapping("/bye/{name}")
    public String bye(@PathVariable String name) {
        return "Bye bye " + name;
    }
}
