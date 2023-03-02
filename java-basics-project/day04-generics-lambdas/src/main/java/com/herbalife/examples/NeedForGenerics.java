package com.herbalife.examples;

import java.util.Arrays;
import java.util.List;

public class NeedForGenerics {
    public static void main(String[] args) {
        List lst = Arrays.asList(12, true, "string", 12.34D);
        for (Object item : lst) {
            System.out.println(item);
        }
        for (int i = 0; i < lst.size(); i++) {
            Object item = lst.get(i);
            if(item instanceof String) { //RTTI operator; 'is' in C#
                String str = (String)item;
                System.out.println("String: " + str);
            } else if(item instanceof Integer) {
                Integer num = (Integer)item;
                System.out.println("Integer: " + num);
            }
        }
    }
}
