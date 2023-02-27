package com.herbalife;

//Java beans or POJOs
//Defining a new reference data type
public class Person {
    private String name;
    private int age;

    //getter setter properties
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

    public void eat(String item) {
        System.out.println(this.name + " is eating " + item);
    }
}
