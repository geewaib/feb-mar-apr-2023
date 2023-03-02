package com.herbalife.examples;

public class PassingLambdasToFunctions {
    public static void main(String[] args) {
        Traveller salesPerson = city -> System.out.println("Sell bonds in " + city);
        Traveller sportsPerson = city -> System.out.println("Play US open in " + city);

        visitNewYork(salesPerson);
        visitNewYork(sportsPerson);
        visitNewYork(city -> System.out.println("Visit Central Park in " + city));
    }

    static void visitNewYork(Traveller traveller) {
        traveller.travel("NYC");
    }
}

class USTravellerOldStyle {
    public void sellBonds(String city) {
    }

    public void playUSOpen(String city) {
    }

    public void visitCentralPark(String city) {
    }
}

@FunctionalInterface
interface Traveller {
    void travel(String city);
}
