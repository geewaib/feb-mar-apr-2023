package com.herbalife.monday;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        int target = (int) (Math.random() * 100);
        int guess = -1;
        int attempts = 0;
        Scanner scanner = new Scanner(System.in);
        boolean gameOver = false;
        String message = "";
        System.out.println("Welcome to the guessing game. Enter a number between 1 and 100");
        while (!gameOver) {
            attempts++;
            guess = scanner.nextInt();
            if (guess > target) {
                message = "Aim Lower";
            } else if (guess < target) {
                message = "Aim Higher";
            } else {
                message = "You've got it in " + attempts + " attempts";
                gameOver = true;
            }
            System.out.println(message);
        }
    }
}
