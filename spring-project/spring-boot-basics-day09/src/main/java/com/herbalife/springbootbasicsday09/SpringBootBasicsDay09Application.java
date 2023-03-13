package com.herbalife.springbootbasicsday09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBasicsDay09Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBasicsDay09Application.class, args);
    }

    @Autowired
    private Person person;

    @Override
    public void run(String... args) throws Exception {
        //STARTING POINT FOR A SPRING BOOT CONSOLE APPLICATION
        person.workFromHome();
    }
}
