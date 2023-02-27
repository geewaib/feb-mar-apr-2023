package com.herbalife;

public class DataTypes {
    public static void main(String[] args) {
        //Primitive types and Reference types
        //Primitive types are created on the stack
        int num = 10;
        byte b = 9;
        long number = 23213213L;
        double pi = 3.14d;
        char letter = 'A';
        boolean bool = false;
        String name = "Sam"; //Not a primitive type though has a syntax like a primitive type

        int i; //Local variables MUST be initialized
        //System.out.println(i);
        //Boxing (Wrapper classes, used for boxing)
        Integer numObj = num;
        Byte bObj = b;
        Long numberObj = number;
        Double piObj = pi;
        Character letterObj = letter;
        Boolean boolObj = bool;

    }
}
