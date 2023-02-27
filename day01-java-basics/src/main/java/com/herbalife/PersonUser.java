package com.herbalife;

public class PersonUser {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Sam");
        p1.setAge(12);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        p1.eat("Bread");
    }
}
