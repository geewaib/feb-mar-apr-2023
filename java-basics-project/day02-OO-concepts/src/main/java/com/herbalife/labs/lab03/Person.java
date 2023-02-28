package com.herbalife.labs.lab03;

import java.util.Arrays;

public class Person {
    private String name;
    private City[] citiesVisited;
    private Person friend;

    public Person(String name) {
        this.name = name;
        this.citiesVisited = new City[0];
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", citiesVisited=" + Arrays.toString(citiesVisited) +
                '}';
    }

    public void visitCity(City newCity) {
        //Easy if you use List; Not a great piece of code using arrays
        City[] cityArr = new City[this.citiesVisited.length + 1];
        for (int i = 0; i <= citiesVisited.length; i++) {
            if (i == citiesVisited.length) {
                cityArr[i] = newCity;
            } else {
                cityArr[i] = citiesVisited[i];
            }
        }
        this.citiesVisited = cityArr;
    }

    public Person getFriend() {
        return friend;
    }

    public void setFriend(Person friend) {
        this.friend = friend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City[] getCitiesVisited() {
        return citiesVisited;
    }

    public void setCitiesVisited(City[] citiesVisited) {
        this.citiesVisited = citiesVisited;
    }
}
