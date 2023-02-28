package com.herbalife.labs.lab03;

public class Lab03User {
    public static void main(String[] args) {
        Person sam = new Person("Sam");
        Country india = new Country("India", "New Delhi", 129809809808d);
        Country usa = new Country("USA", "Washington DC", 329809809d);
        City pune = new City("Pune", india);
        City chennai = new City("Chennai", india);
        City newJersey = new City("NJ", usa);

        sam.visitCity(pune);
        sam.visitCity(chennai);
        sam.visitCity(newJersey);
        System.out.println(sam);

        City houston = new City("Houston", usa);
        sam.visitCity(houston);
        System.out.println(sam);
        sam.setFriend(new Person("Ram"));
        System.out.println(sam.getFriend());
    }
}
