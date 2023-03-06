package com.herbalife.examples;


import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInFunctionalInterfaces {
    public static void main(String[] args) {
        //Predicate
        Predicate<Long> isEven = num -> num % 2 == 0;
        Predicate<Long> isLt = num -> num < 10;
        System.out.println(isEven
                .and(isLt)
                .test(12L));

        //Function
        Function<Integer, Integer> square = num -> num * num;
        System.out.println(square.apply(12));

        //Supplier
        Supplier<String> now = () -> Instant.now().toString();
        Supplier<Integer> randomGenerator = () -> (int) (Math.random() * 100);
        System.out.println(now.get());
        System.out.println(randomGenerator.get());

        //Consumer
        Consumer<String> printConsole = data -> System.out.println(data);
        printConsole.accept("Hello there");

        Consumer<Integer> logNumber = num -> System.out.println("Logging " + num);
        logNumber.accept(12);

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        numbers.forEach(num -> System.out.println(num));


    }
}
