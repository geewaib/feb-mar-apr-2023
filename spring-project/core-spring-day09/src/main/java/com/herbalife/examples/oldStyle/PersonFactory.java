package com.herbalife.examples.oldStyle;

//Spring tells you, don't create factory classes anymore. I will create the objects and give them to you
public class PersonFactory {
    public static Person getPerson(String name, int age, String city, String country) {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        Address samResidence = new Address();
        samResidence.setCity(city);
        samResidence.setCountry(country);
        person.setResidence(samResidence);
        return person;
    }
}
