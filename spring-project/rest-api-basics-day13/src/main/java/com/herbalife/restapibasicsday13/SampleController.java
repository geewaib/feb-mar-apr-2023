package com.herbalife.restapibasicsday13;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestController
public class SampleController {

    @GetMapping("/divide/{a}/{b}")
    public int divide(@PathVariable int a, @PathVariable int b) {
        int result = a / b;
        return result;
    }

//    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
//    public String handleMethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException ex, WebRequest webRequest) {
//        return "Error: " + ex.getMessage();
//    }
//
//    @ExceptionHandler(ArithmeticException.class)
//    public String handleArithmeticException(ArithmeticException ex, WebRequest webRequest) {
//        return "Error: " + ex.getMessage();
//    }

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
    public String greet(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {
        return "Hi " + firstName + " " + lastName;
    }


}
