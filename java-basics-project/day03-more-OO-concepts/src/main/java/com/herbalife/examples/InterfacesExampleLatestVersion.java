package com.herbalife.examples;

public class InterfacesExampleLatestVersion {
    public static void main(String[] args) {
        Dog snoopy = new Dog();
        snoopy.move();
        snoopy.makeNoise();
        Animal.doSomethingWithoutThinking();
    }
}

interface Animal {
    default void move() {
        System.out.println("moving");
    }

    static void doSomethingWithoutThinking() {
        System.out.println("Doing something silly");
    }

    void makeNoise();
}

class Dog implements Animal {
    public void move() {
        System.out.println("walking, wagging, walking, wagging");
    }

    public void makeNoise() {
        System.out.println("bow bow");
    }
}

class Cat implements Animal {
    public void makeNoise() {
        System.out.println("meow meow");
    }
}
