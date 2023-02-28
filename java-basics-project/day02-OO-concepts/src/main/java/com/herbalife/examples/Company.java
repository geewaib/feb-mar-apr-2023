package com.herbalife.examples;

public class Company {
    private static int numberOfCompanies;

    static {
        //static initializer block
        //similar to static constructors in .NET
        numberOfCompanies = 0;
    }

    public Company() {
        numberOfCompanies++;
    }

    public static int getNumberOfCompanies() {
        return numberOfCompanies;
    }
}
