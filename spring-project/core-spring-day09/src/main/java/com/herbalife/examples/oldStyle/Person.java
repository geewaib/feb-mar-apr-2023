package com.herbalife.examples.oldStyle;

public class Person {
    private String name;
    private int age;
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
