package com.herbalife;

public class StringBasics {
    public static void main(String[] args) {
        //Immutable data type
        String lang = "Java";
        String lang2 = "Java";
        lang = lang + " is cool";

        String lang3 = "Java";

        String value = "";
        for (int i = 1; i <= 5; i++) {
            value += i; //Every time a new object is created. It's a costly affair
        }
        System.out.println(value);

        //Do not use string if you want to manipulate the values frequently
        StringBuilder stringBuilder = new StringBuilder("");
        for (int j = 1; j <= 5; j++) {
            stringBuilder.append(j);
        }
        String finalValue = stringBuilder.toString();
        System.out.println(finalValue);
    }
}
