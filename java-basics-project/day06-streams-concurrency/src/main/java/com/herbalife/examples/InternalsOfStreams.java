package com.herbalife.examples;

import java.util.Arrays;
import java.util.List;

public class InternalsOfStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(100, 200, 300, 400, 500);

        //Filter the numbers > 250, square them and print them
        numbers
                .stream()
                .filter(num -> {
                    System.out.println("***Filter " + num);
                    return num > 250;
                })
                .map(num -> {
                    System.out.println("***Map " + num);
                    return num * num;
                })
                .forEach(num -> System.out.println(num));

        System.out.println();
        int result = numbers
                .stream()
                .filter(num -> {
                    System.out.println("***Filter " + num);
                    return num > 250;
                })
                .map(num -> {
                    System.out.println("***Map " + num);
                    return num * num;
                })
                .findAny()
                .get();
        System.out.println(result);
    }
}
