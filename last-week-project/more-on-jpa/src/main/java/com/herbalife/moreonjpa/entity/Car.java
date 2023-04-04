package com.herbalife.moreonjpa.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Car {

    @EmbeddedId
    private CarCompositeKey carCompositeKey;

    @Column(name = "year_of_make")
    private int yearOfMake;
}
