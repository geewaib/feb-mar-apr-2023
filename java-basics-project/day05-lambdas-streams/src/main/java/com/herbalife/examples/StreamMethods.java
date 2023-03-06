package com.herbalife.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
        //filter() returns a collection
        //collect() generates a new collection(set or list or map)
        List<String> langs = Arrays.asList("Java", "Scala", "Golang", "JavaScript", "TS");

        List<String> langsStartingWithJ = langs
                .stream()
                .filter(lang -> lang.startsWith("J"))
                .collect(Collectors.toList());
        langsStartingWithJ.forEach(System.out::println);

        //Filter the languages starting with J and print in UpperCase
        langs
                .stream()
                .filter(lang -> lang.startsWith("J"))
                .map(lang -> lang.toUpperCase()) //transformation of an item from ONE format to ANOTHER
                .forEach(System.out::println);

        //Filter the languages starting with J and generate a set of languages in UPPERCASE
        Set<String> languages = langs
                .stream()
                .filter(lang -> lang.startsWith("J"))
                .map(lang -> lang.toUpperCase())
                .collect(Collectors.toSet());
        languages.forEach(System.out::println);

        //reduce takes a collection and reduces it to ONE value
        List<Integer> numbers = Arrays.asList(120, 2, 34, 67, 8, 91);
        int sum = numbers
                .stream()
                .reduce(0, (total, current) -> total + current)
                .intValue();
        System.out.println(sum);

    }
}
