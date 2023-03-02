package com.herbalife.labs.lab08;

import com.herbalife.labs.lab07.Calc;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lab08UsingLambda {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder = (a, b) -> a + b;
        operate(adder);
        operate((a, b) -> a - b);
        operate((a, b) -> a * b);
        operate((a, b) -> (a * a) + (b * b) + (2 * a * b));

        Function<Data, Data> aSquared = data -> new Data(data.num1, data.num2, (data.num1 * data.num1) + data.result);
        Function<Data, Data> bSquared = data -> new Data(data.num1, data.num2, (data.num2 * data.num2) + data.result);
        Function<Data, Data> twoAB = data -> new Data(data.num1, data.num2, (2 * data.num1 * data.num2) + data.result);

        Data resultData = aSquared
                .andThen(bSquared)
                .andThen(twoAB)
                .apply(new Data(2, 3, 0)); //4 + 9 + 12
        System.out.println(resultData.result);
    }


    static void operate(BiFunction<Integer, Integer, Integer> calc) {
        System.out.println(calc.apply(10, 5));
    }
}

class Data {
    public final int num1;
    public final int num2;
    public final int result;

    public Data(int num1, int num2, int result) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
    }
}
