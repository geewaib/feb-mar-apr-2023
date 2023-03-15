package com.herbalife.springbootlab03jpa;

import com.herbalife.springbootlab03jpa.service.ConferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLab03JpaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLab03JpaApplication.class, args);
    }

    @Autowired
    private ConferenceService conferenceService;

    @Override
    public void run(String... args) throws Exception {
        conferenceService.removeTopic("Unit testing Spring");
        conferenceService.addTopic("Redux", 90);
        conferenceService.getAllTopics().forEach(System.out::println);
    }
}
