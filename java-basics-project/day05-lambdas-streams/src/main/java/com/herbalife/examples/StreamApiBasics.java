package com.herbalife.examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class StreamApiBasics {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60);
        //A stream is a snapshot of the underlying collection
        //You can use the stream to process your collection
        //You CANNOT MODIFY the collection using stream
        Stream<Integer> numbersStream = numbers.stream(); //Starting point
        numbersStream
                .filter(it -> it % 2 == 0)
                .forEach(it -> System.out.println(it));

        //Streams cannot be reused
//        numbersStream
//                .filter(it -> it % 2 == 0)
//                .forEach(it -> System.out.println(it));

        Stream<Integer> numbersStream2 = numbers.stream();
        numbersStream2
                .filter(it -> it % 2 != 0)
                .forEach(it -> System.out.println(it));

        numbers
                .stream()
                .filter(it -> it % 2 == 0)
                .forEach(it -> System.out.println(it));

        System.out.println("*****DIVISIBLE BY 5");

        //Streams are LAZILY evaluated
        //They are evaluated only when the terminal statement is met. eg., forEach, collect, get
        Stream<Integer> divisibleBy5Stream = numbers
                .stream()
                .filter(it -> it % 5 == 0);

        divisibleBy5Stream
                .forEach(it -> System.out.println(it));


        Map<String, Long> citiesPopulationMap = new HashMap<>();
        citiesPopulationMap.put("Tokyo", 3294930L);
        citiesPopulationMap.put("Chennai", 294930L);
        citiesPopulationMap.put("Singapore", 31294930L);
        citiesPopulationMap
                .forEach((k, v) -> System.out.println(k + ": " + v));

        citiesPopulationMap
                .keySet()
                .stream()
                .filter(city -> citiesPopulationMap.get(city) > 1000000L)
                .forEach(it -> System.out.println(it));


    }
}
