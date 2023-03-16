package com.herbalife.jpamoreconceptsday12;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    //findBy and findAllBy methods

    @Query(value = "select * from persons p where p.age between :start and :end", nativeQuery = true) //NOT RECOMMENDED
    List<Person> loadPersonsWithAgeBtn(@Param("start") int start, @Param("end") int end);

    @Query(value = "select p from Person p where p.age between :start and :end") //JPQL
    List<Person> loadPersonsWithAgeBetween(@Param("start") int start, @Param("end") int end);

    List<Person> findAllByFirstName(String firstName);

    List<Person> findAllByFirstNameAndLastName(String firstName, String lastName);

    List<Person> findAllByFirstNameAndLastNameAndAge(String firstName, String lastName, int age);

    Person findByFirstName(String firstName);

    Person findByIdAndAge(int id, int age);

    List<Person> findAllByAgeBetween(int start, int end);

    List<Person> findAllByFirstNameContainingIgnoreCaseOrAgeGreaterThan(String firstName, int age);

    List<Person> findAllByLastNameEndingWithIgnoreCaseOrAgeGreaterThanOrderByAgeDesc(String lastName, int age);
}
