package com.herbalife;

public class BasicsOfArrays {
    public static void main(String[] args) {
        final String name;
        name = "Hello";
      //  name = "Bye";

        int[] numbers = new int[10];
        int[] lst = {10, 20, 30};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //used for read only operation
        for (int num : lst) {
            System.out.println(num);
        }

        int coll[] = new int[10];
        int[] collection = new int[10];
        int col[] = new int[10];

        //Not widely used these days; Dictionary collections have replaced these
        int[][] matrix = new int[10][10];
        int[] matrix2[] = new int[10][10];
        int matrix3[][] = new int[10][10];
        int matrix4[][] = new int[10][];

    }
}
