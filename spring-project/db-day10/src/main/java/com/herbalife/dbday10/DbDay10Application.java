package com.herbalife.dbday10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbDay10Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DbDay10Application.class, args);
    }

    @Autowired
    private PersonsDao personsDao;

    @Override
    public void run(String... args) throws Exception {
        //personsDao.insertPerson("Ram", "Jothi", 34);
        //personsDao.insertPerson("Joe", "Blue", 45);
        //personsDao.updateAge(1, 48);

        personsDao.printPersonsWithAgeGt(10);

        personsDao.getAllPersons().forEach(System.out::println);

        personsDao.getFirstNames().forEach(System.out::println);
        personsDao
                .getAll()
                .forEach(row -> {
                    row.forEach((col, value) -> {
                        System.out.println(col + ": " + value);
                    });
                    System.out.println();
                });
    }
}
