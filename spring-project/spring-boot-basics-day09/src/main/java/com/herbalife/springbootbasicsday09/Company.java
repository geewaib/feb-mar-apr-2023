package com.herbalife.springbootbasicsday09;

import org.springframework.stereotype.Component;

@Component
public class Company {
    public Company() {
        System.out.println("****Company created");
    }
}
