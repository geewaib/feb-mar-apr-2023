package com.herbalife.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsBasics {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        for (int num : numbers) {
            System.out.println(num);
        }

        List<String> cities = new ArrayList<String>();
        List<String> cities2 = new ArrayList<>(); //More widely used
        List<String> cities3 = new ArrayList();

        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<String> strList = new ArrayList<>();

        //Generics is a compile time gimmick; JVM doesn't care or know about generics at all
        System.out.println(numList.getClass());
        System.out.println(strList.getClass());
    }
}
