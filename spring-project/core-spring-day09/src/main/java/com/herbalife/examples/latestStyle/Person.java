package com.herbalife.examples.latestStyle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//<bean id="person" class=""/>
@Component
public class Person {
    @Value("Mary Joe")
    private String name;
    @Value("32")
    private int age;

    @Autowired
    private Address residence;

    public void workFromHome() {
        System.out.println(name + " is working from " + residence);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getResidence() {
        return residence;
    }

    public void setResidence(Address residence) {
        this.residence = residence;
    }
}
