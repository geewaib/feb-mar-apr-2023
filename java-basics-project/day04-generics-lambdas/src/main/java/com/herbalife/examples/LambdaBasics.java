package com.herbalife.examples;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class LambdaBasics {
    public static void main(String[] args) {
        Printer printer = data -> System.out.println(data); //Type of the argument is inferred
        printer.print("hello");

        Printer printer2 = (String data) -> System.out.println(data);
        printer2.print("some data");

        Printer printer3 = data -> {
            System.out.println("Printing " + data + " on console");
            System.out.println("Sending " + data + " to logstream");
        };
        printer3.print("some data");

        MyClock myClock = () -> LocalTime.now().toString();
        System.out.println(myClock.now());

        MyClock myClock2 = () -> {
            return LocalTime.now().toString();
        };
        System.out.println(myClock2.now());

        List<Printer> printers = new ArrayList<>();
        printers.add(data -> System.out.println(data));
        printers.add(data -> System.out.println(data.toLowerCase()));
        printers.add(data -> System.out.println(data.toUpperCase()));
        printers.add(data -> System.out.println("This is " + data));

        for (Printer printerItem: printers) {
                printerItem.print("Lambda is cool I am able to treat block of code as ordinary variables");
        }
    }
}

@FunctionalInterface
interface MyClock {
    String now();
}

@FunctionalInterface
interface Printer {
    void print(String data);
}