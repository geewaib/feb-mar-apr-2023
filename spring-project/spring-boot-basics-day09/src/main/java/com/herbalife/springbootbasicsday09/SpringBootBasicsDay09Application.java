package com.herbalife.springbootbasicsday09;

import com.labs.lab01.Conference;
import com.labs.lab01.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootApplication
@ComponentScan(basePackages = "com")
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

    @Autowired
    private Conference conference;

    @Override
    public void run(String... args) throws Exception {
        //STARTING POINT FOR A SPRING BOOT CONSOLE APPLICATION

        conference
                .getTopicDurationMap()
                .forEach((duration, topics) -> {
                    System.out.println("----" + duration + "m ----");
                    topics.forEach(System.out::println);
                });




//        conference.getAllTopics().forEach(System.out::println);
//        Map<Integer, List<Topic>> topicMap = conference
//                .getAllTopics()
//                .stream()
//                .collect(Collectors.groupingBy(item -> item.getDuration()));
//
//        topicMap.forEach((duration, topics) -> {
//            System.out.println("***" + duration + "min topics");
//            topics.stream().map(t -> t.getName()).forEach(System.out::println);
//        });

//        System.out.println(training.getName());
//        System.out.println(training.getVenue());
//        training.getContents().forEach(System.out::println);


        //System.out.println(store.getName());
        //store.getItems().forEach(System.out::println);


        //person.workFromHome();
//        System.out.println(book1);
//        System.out.println(book2);
//        System.out.println(book3);
    }
}
