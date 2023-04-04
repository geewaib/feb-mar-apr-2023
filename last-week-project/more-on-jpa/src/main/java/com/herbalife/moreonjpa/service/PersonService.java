package com.herbalife.moreonjpa.service;

import com.herbalife.moreonjpa.entity.Person;
import com.herbalife.moreonjpa.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private EntityManager entityManager;


    public void create(String firstName, String lastName) {
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        personRepository.save(person);
    }


    @Transactional //(isolation = Isolation.READ_UNCOMMITTED)
    public void createPersonsForBankAccount(String kidFirstName, String kidLastName, String guardianFirstName, String guardianLastName) {
        //Use TransactionTemplate if you want to manage txn programmatically
        create(kidFirstName, kidLastName);
        create(guardianFirstName, guardianLastName);
    }

    public Person get(String firstName, String lastName) {
        Person person = new Person();
        person.setId(9); //demo sake
        person.setFirstName(firstName);
        person.setLastName(lastName);
        Example<Person> personExample = Example.of(person);
        return personRepository.findOne(personExample).orElse(null);
    }

    public List<Person> getListOfPersonsWith(String firstName, int age) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Person> criteriaQuery = criteriaBuilder.createQuery(Person.class);
        Root<Person> personRoot = criteriaQuery.from(Person.class);

        Predicate predicateForName
                = criteriaBuilder.equal(personRoot.get("firstName"), firstName);
        Predicate predicateForAge
                = criteriaBuilder.greaterThan(personRoot.get("age"), age);

        Predicate predicate
                = criteriaBuilder.or(predicateForName, predicateForAge);

        criteriaQuery.where(predicate);
        List<Person> personList = entityManager.createQuery(criteriaQuery).getResultList();
        return personList;
    }


}
