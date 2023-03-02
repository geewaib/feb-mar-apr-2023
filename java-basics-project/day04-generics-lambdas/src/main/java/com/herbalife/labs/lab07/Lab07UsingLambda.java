package com.herbalife.labs.lab07;

public class Lab07UsingLambda {
    public static void main(String[] args) {
        Calc adder = (a, b) -> a + b;
        operate(adder);

        operate((a, b) -> a - b);
        operate((a, b) -> a * b);
    }

    static void operate(Calc calc) {
        System.out.println(calc.compute(10, 5));
    }
}
