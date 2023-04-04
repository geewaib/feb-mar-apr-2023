package com.herbalife.moreonjpa.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString
@Entity
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name", unique = true) //unique constraint is added if table is created dynamically otherwise it's of no use
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(nullable = true)
    private Integer age;
}
