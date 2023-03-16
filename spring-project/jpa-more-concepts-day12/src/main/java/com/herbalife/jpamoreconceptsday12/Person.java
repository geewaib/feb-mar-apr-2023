package com.herbalife.jpamoreconceptsday12;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@ToString
@Entity
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(nullable = true)
    private Integer age;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id")
    private List<Dog> dogs;

    public void addDog(Dog dog) {
        if(this.dogs == null) {
            this.dogs = new ArrayList<>();
        }
        dogs.add(dog);
    }
}
