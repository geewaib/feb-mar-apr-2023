package com.herbalife.springbootlab02jdbc;

import com.herbalife.springbootlab02jdbc.service.ConferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLab02JdbcApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLab02JdbcApplication.class, args);
    }

    @Autowired
    private ConferenceService conferenceService;

    @Override
    public void run(String... args) throws Exception {

    }
}
