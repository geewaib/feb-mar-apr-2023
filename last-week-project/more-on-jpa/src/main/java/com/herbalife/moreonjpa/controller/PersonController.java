package com.herbalife.moreonjpa.controller;

import com.herbalife.moreonjpa.entity.Person;
import com.herbalife.moreonjpa.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping("/bank")
    public void openBankAccountForKid(@RequestParam String kidFirstName, @RequestParam String kidLastName,
                                      @RequestParam String guardianFirstName, @RequestParam String guardianLastName) {
        personService.createPersonsForBankAccount(kidFirstName, kidLastName, guardianFirstName, guardianLastName);
    }

    @PostMapping
    public void create(@RequestParam String firstName,
                       @RequestParam String lastName) {
        personService.create(firstName, lastName);
    }

    @GetMapping
    public Person getPerson(@RequestParam String firstName, @RequestParam String lastName) {
        return personService.get(firstName, lastName);
    }

    @GetMapping("/firstName/{firstName}/age/{age}")
    public List<Person> getPersons(@PathVariable String firstName, @PathVariable int age) {
        return personService.getListOfPersonsWith(firstName, age);
    }
}
