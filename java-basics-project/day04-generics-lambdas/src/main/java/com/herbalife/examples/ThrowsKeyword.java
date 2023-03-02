package com.herbalife.examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ThrowsKeyword {
    public static void main(String[] args) throws IOException {
        int i = 10 / 0;

        try {
            Files.readAllLines(Paths.get("path"));
        } catch (IOException ex) {
        }
        performIOOperations();

        try {
            performSomeMoreIOOperations();
        } catch (IOException ex) {

        }

        performSomeMoreIOOperations();


    }

    static void performSomeMoreIOOperations() throws IOException {
        Files.readAllLines(Paths.get("path"));
    }

    static void performIOOperations() {
        try {
            Files.readAllLines(Paths.get("path"));
        } catch (IOException ex) {
        }
    }
}

//Exceptions are categorized into Checked and Unchecked exceptions

//Checked exceptions are those that need to be MANDATORILY handled in code
//Examples: SqlException, IOException
//All the Exception classes that extend java.lang.Exception are Checked exceptions

//Unchecked exceptions are those that need not be handled in code (during development)
//Examples: All RuntimeExceptions
//All the Exception classes that extends RuntimeException are Unchecked exceptions