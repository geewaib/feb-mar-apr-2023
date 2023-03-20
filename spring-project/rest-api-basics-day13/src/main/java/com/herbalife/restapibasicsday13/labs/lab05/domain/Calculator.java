package com.herbalife.restapibasicsday13.labs.lab05.domain;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int square(int a) {
        return a * a;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
