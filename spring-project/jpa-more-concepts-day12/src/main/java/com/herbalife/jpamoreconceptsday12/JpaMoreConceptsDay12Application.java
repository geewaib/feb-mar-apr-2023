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

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private DogRepository dogRepository;

    @Override
    public void run(String... args) throws Exception {

        Person p = new Person();
        p.setFirstName("Andrew");
        p.setLastName("Arbaz");
        p.setAge(40);

        Dog snoopy = new Dog();
        snoopy.setName("Snoopy");
        dogRepository.save(snoopy);

        Dog rover = new Dog();
        rover.setName("Rover");
        dogRepository.save(rover);

        p.addDog(snoopy);
        p.addDog(rover);
        personRepository.save(p);

        Car ferrari = new Car();
        ferrari.setModel("Ferrari");
        ferrari.setYearOfMake(2023);
        ferrari.setOwner(p);
        carRepository.save(ferrari);



//        Car bmw = carRepository.findById(1).get();
//        //System.out.println(bmw.getModel() + ", " + bmw.getOwner());
//        System.out.println(bmw.getModel());
//
//        Car tesla = carRepository.loadCarWithOwnerInformation(2);
//        System.out.println(tesla);

//        Person p1 = new Person();
//        p1.setFirstName("Shekhar");
//        p1.setLastName("Suman");
//        p1.setAge(50);
//        personRepository.save(p1);
//
//        Car bmw = new Car();
//        bmw.setModel("BMW 8");
//        bmw.setYearOfMake(2020);
//        bmw.setOwner(p1);
//
//        Car tesla = new Car();
//        tesla.setModel("Tesla XY");
//        tesla.setYearOfMake(2022);
//        tesla.setOwner(p1);
//
//        carRepository.save(bmw);
//        carRepository.save(tesla);




        //personRepository.loadPersonsWithAgeBetween(10, 30).forEach(System.out::println);

        // personRepository.findAllByFirstName("Ram").forEach(System.out::println);
        // personRepository.findAllByAgeBetween(10, 40).forEach(System.out::println);
        // personRepository.findAllByFirstNameContainingIgnoreCaseOrAgeGreaterThan("ram", 20);
        //personRepository.findAllByLastNameEndingWithIgnoreCaseOrAgeGreaterThanOrderByAgeDesc("as", 30).forEach(System.out::println);

//        Person person = new Person();
//        person.setFirstName("Ram");
//        person.setLastName("Das");
//        personRepository.save(person);


    }
}
