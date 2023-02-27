package com.herbalife;

public class StringComparison {
    public static void main(String[] args) {
        String lang1 = "Java";
        String lang2 = "Java";
        System.out.println(lang1 == lang2);

        String lang3 = new String("Java");
        System.out.println(lang1 == lang3);

        //== compares the references
        System.out.println(lang1.equals(lang2));
        System.out.println(lang1.equals(lang3));

        //Stick to one way of creating a string in your application
        //Either without using new keyword or using new keyword
        //Always use .equals if you want to compare the values in a string
    }
}
