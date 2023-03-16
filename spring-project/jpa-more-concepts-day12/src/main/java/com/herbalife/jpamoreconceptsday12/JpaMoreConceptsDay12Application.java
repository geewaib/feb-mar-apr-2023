package com.herbalife.jpamoreconceptsday12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaMoreConceptsDay12Application implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(JpaMoreConceptsDay12Application.class, args);
    }

    @Autowired
    private PersonRepository personRepository;

    @Override
    public void run(String... args) throws Exception {
        // personRepository.findAllByFirstName("Ram").forEach(System.out::println);
        // personRepository.findAllByAgeBetween(10, 40).forEach(System.out::println);
        // personRepository.findAllByFirstNameContainingIgnoreCaseOrAgeGreaterThan("ram", 20);
        personRepository.findAllByLastNameEndingWithIgnoreCaseOrAgeGreaterThanOrderByAgeDesc("as", 30).forEach(System.out::println);
//        Person person = new Person();
//        person.setFirstName("Ram");
//        person.setLastName("Das");
//        personRepository.save(person);


    }
}
