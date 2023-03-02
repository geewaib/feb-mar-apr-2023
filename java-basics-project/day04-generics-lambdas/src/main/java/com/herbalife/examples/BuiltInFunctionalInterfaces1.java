package com.herbalife.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuiltInFunctionalInterfaces1 {
    public static void main(String[] args) {
        //Predicate, Function, Supplier, Consumer
        //Define in package java.util.function
        useOfPredicate();
        useOfFunction();
    }

    private static void useOfFunction() {
        //Function is a FI that takes data of type X and returns data of type Y
        Function<Integer, Integer> incrementer = num -> num + 1;
        System.out.println(incrementer.apply(12));

        Function<String, Integer> length = data -> data.length();
        System.out.println(length.apply("hello"));

        Function<Integer, Integer> randomGenerator = limit -> (int) (Math.random() * limit);
        System.out.println(randomGenerator
                .andThen(incrementer)
                .apply(10));


    }


    private static void useOfPredicate() {
        //Predicate is a FI that accepts data of any Type and returns boolean
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(12));
        System.out.println(isEven.test(1));

        Predicate<List> containsAtleastOneItem = lst -> lst.size() >= 1;

        List<Integer> numbers = Arrays.asList(10, 20);
        System.out.println(containsAtleastOneItem.test(numbers));
        List<String> langs = new ArrayList<>();
        System.out.println(containsAtleastOneItem.test(langs));

        Predicate<Integer> gt100 = num -> num > 100;
        int number = 104;
        boolean result = isEven
                .and(gt100)
                .test(number);
        System.out.println(result);
    }
}
