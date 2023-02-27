package com.herbalife.monday;

import java.util.Arrays;
import java.util.List;

public class Lab02 {
    public static void main(String[] args) {
        calculateSumOfOddNumbersBetween1To10001();
        int[] exclusionList = {10, 19, 21, 39, 309, 431, 643, 942, 1209, 7981, 8888, 9910};
        calculateIntegerAverageOfAllNumbersFrom1To10001Excluding(exclusionList);
        calculateIntegerAverageOfAllNumbersFrom1To10001Excluding(exclusionList);
        computeValue();

    }

    static void computeValue() {
        int sum = 0;
        String input = "+5 -1 +9 +5 -67 +5 -3 +2 -4 +6 +8 -13 +2 -4 +6 +18 -3 +2 -4 +6 +88 +15 -1 +9 +5 -67 +45 -3 +2 -4 +36 +8 -13 +2 -4 +6 +18 -3 +2 -74 +11 +109";
        String[] values = input.split(" ");
        for (String value : values) {
            sum += Integer.parseInt(value);
        }
        System.out.println("Total value: " + sum);
    }

    static void calculateIntegerAverageOfAllNumbersFrom1To10001Excluding(Integer[] exclusionList) {
        List<Integer> exclusionLst = Arrays.asList(exclusionList);

        int sum = 0;
        for (int i = 1; i <= 10001; i++) {
            if (!exclusionLst.contains(i)) {
                sum += i;
            }
        }
        int count = 10001 - exclusionList.length;
        int average = sum / count;
        System.out.println("Average: " + average);
    }

    static void calculateIntegerAverageOfAllNumbersFrom1To10001Excluding(int[] exclusionList) {
        int sum = 0;
        for (int i = 1; i <= 10001; i++) {
            sum += i;
        }
        for (int excludedNum : exclusionList) {
            sum -= excludedNum;
        }
        int count = 10001 - exclusionList.length;
        int average = sum / count;
        System.out.println("Average: " + average);
    }

    static void calculateSumOfOddNumbersBetween1To10001() {
        int sum = 0;
        for (int i = 1; i <= 10001; i++) {
            sum += i % 2 == 1 ? i : 0;
        }
        System.out.println("Sum of odd numbers between 1 and 10001: " + sum);
    }
}
