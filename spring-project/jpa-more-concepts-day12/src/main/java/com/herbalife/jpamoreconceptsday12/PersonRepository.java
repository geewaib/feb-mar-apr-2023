package com.herbalife.jpamoreconceptsday12;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    //findBy and findAllBy methods

    List<Person> findAllByFirstName(String firstName);

    List<Person> findAllByFirstNameAndLastName(String firstName, String lastName);

    List<Person> findAllByFirstNameAndLastNameAndAge(String firstName, String lastName, int age);

    Person findByFirstName(String firstName);

    Person findByIdAndAge(int id, int age);

    List<Person> findAllByAgeBetween(int start, int end);

    List<Person> findAllByFirstNameContainingIgnoreCaseOrAgeGreaterThan(String firstName, int age);

    List<Person> findAllByLastNameEndingWithIgnoreCaseOrAgeGreaterThanOrderByAgeDesc(String lastName, int age);
}
