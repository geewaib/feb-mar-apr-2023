package com.herbalife.examples;

abstract public class Vehicle {
    //can have variables
    //can have constructors
    //can have concrete methods
    abstract void drive();
}

class Bus extends Vehicle {

    void drive() {
        System.out.println("Driving bus");
    }
}
