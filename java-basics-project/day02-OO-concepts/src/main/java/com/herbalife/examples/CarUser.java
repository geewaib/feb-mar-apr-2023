package com.herbalife.examples;

public class CarUser {
    public static void main(String[] args) {
        Car myCar = new Car("BMW", 2021);
        System.out.println(myCar.getModel() + ", " + myCar.getYearOfMake());
        System.out.println(myCar);
        myCar.drive(200);
        myCar.drive();

        myCar = new Car("Ferrari", 2023);
        System.out.println(myCar.getModel() + ", " + myCar.getYearOfMake());
        System.out.println(myCar);
        myCar.drive(200);
        myCar.drive();

        Car myWifeCar = myCar;

        Car car1 = new Car("Honda City", 2020);
        Engine carEngine1 = new Engine(2000);
        car1.setEngine(carEngine1);
        System.out.println(car1);





    }
}
