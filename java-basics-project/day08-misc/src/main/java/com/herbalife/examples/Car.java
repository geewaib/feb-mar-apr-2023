package com.herbalife.examples;

public class Car {
    private String model;

    @MyComment("Cool method")
    public void drive(int speed) {
        System.out.println("Driving " + model + " at a speed of " + speed + "mph");
    }
}
