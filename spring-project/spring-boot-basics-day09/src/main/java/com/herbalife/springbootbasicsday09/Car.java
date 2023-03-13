package com.herbalife.springbootbasicsday09;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Car {
    public Car() {
        System.out.println("*****Car created");
    }
}
