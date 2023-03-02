package com.herbalife.examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExceptionHandlingBasics {
    public static void main(String[] args) {

        int num = (int)(Math.random() * 10);
        if(num > 5) {
            throw new RuntimeException("Number cannot be gt 5");
        }
        if(num == 5) {
            throw new RandomNumberException("Number cannot be 5");
        }

        try {
            int i = 10;
            int j = i / 0;
            Files.readAllLines(Paths.get(""));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End of main");
        }

        try {
            int i = 10;
            int j = i / 0;
            Files.readAllLines(Paths.get(""));
        } catch (IOException | ArithmeticException e) { //Syntax is cool, but not very widely used
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End of main");
        }

        try {
            int i = 10;
            int j = i / 0;
            Files.readAllLines(Paths.get(""));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End of main");
        }
    }
}

class RandomNumberException extends RuntimeException {
    public RandomNumberException(String message) {
        super(message);
    }
}