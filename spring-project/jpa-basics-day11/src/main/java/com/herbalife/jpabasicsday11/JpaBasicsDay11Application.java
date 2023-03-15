package com.herbalife.jpabasicsday11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class JpaBasicsDay11Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(JpaBasicsDay11Application.class, args);
    }

    @Autowired
    private PersonsDao personsDao;

    @Override
    public void run(String... args) throws Exception {
//        Person person = new Person();
//        person.setFirstName("Steffi");
//        person.setLastName("Graf");
//        person.setAge(54);
//        personsDao.save(person);

        personsDao
                .findAll()
                .forEach(System.out::println);


        //update a person's age
        Optional<Person> optionalPerson =  personsDao.findById(1);
        if(optionalPerson.isPresent()) {
            Person p = optionalPerson.get();
            p.setAge(p.getAge() + 1);
            personsDao.save(p);
        }

        //delete a person
        Optional<Person> optPerson =  personsDao.findById(5);
        if(optPerson.isPresent()) {
            Person p = optPerson.get();
            personsDao.delete(p);
        }
    }
}
