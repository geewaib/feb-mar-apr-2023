package com.herbalife.springbootmorebasicsday11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMoreBasicsDay11Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMoreBasicsDay11Application.class, args);
    }

    @Autowired
    private Person person;

    @Autowired
    private Door door;

    @Autowired
    private Book book;

    @Override
    public void run(String... args) throws Exception {
        book.getAuthors().forEach(System.out::println);

        System.out.println(person.getName());
        door.open();
        door.close();
    }
}
