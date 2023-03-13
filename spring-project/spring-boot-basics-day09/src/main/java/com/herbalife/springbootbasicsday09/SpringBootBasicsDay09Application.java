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

    @Autowired
    private Car car;

    @Autowired
    private Book book1;

    @Autowired
    private Book book2;

    @Autowired
    private Book book3;

    @Autowired
    private Store store;

    @Autowired
    private Training training;

    @Override
    public void run(String... args) throws Exception {
        //STARTING POINT FOR A SPRING BOOT CONSOLE APPLICATION

        System.out.println(training.getName());
        System.out.println(training.getVenue());
        training.getContents().forEach(System.out::println);


        //System.out.println(store.getName());
        //store.getItems().forEach(System.out::println);


        //person.workFromHome();
//        System.out.println(book1);
//        System.out.println(book2);
//        System.out.println(book3);
    }
}
