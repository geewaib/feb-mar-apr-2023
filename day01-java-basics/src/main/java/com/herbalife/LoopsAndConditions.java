package com.herbalife;

public class LoopsAndConditions {
    public static void main(String[] args) {
        /*
         * Block comments written like this
         *
         * */
        int i = 10;
        if (i % 2 == 0) {
            System.out.println(i + " is even");
        } else if (i % 2 == 1) {
            System.out.println(i + " is odd");
        } else {
            System.out.println("WTH is this number?");
        }

        switch (i % 2) {
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;
            default:
                System.out.println("I don't know");
        }
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }
        int count = 0;

        while (count < 5) {
            System.out.println(count);
            count++;
        }

        do {
            System.out.println("Hello");
            count++;
        } while (count < 10);
    }
}
