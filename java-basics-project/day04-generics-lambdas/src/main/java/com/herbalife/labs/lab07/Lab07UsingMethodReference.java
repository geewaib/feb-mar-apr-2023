package com.herbalife.labs.lab07;

public class Lab07UsingMethodReference {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Calc adder = calculator::add;
        operate(adder);

        operate(calculator::subtract);
        operate(calculator::multiply);
    }

    static void operate(Calc calc) {
        System.out.println(calc.compute(10, 5));
    }
}

class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
}