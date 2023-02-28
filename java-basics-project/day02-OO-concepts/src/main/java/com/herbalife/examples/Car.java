package com.herbalife.examples;

public class Car {
    private String model;
    private int yearOfMake;
    private Engine engine;

    public Car(String model, int yearOfMake) {
        this.model = model;
        this.yearOfMake = yearOfMake;
    }
    public Car() {

    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void drive(int speed) {
        System.out.println("Driving " + this.model + " at a speed of " + speed + "mph");
    }
    public void drive() {
        System.out.println("Driving " + this.model + " slowly");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfMake() {
        return yearOfMake;
    }

    public void setYearOfMake(int yearOfMake) {
        this.yearOfMake = yearOfMake;
    }

    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", yearOfMake=" + yearOfMake +
                '}';
    }
}
