package com.herbalife.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentPackageBasics {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(() -> {
            while (true) {
                System.out.println(Thread.currentThread().getName() + " is coding in C#");
                MyThreadUtil.sleep(1000);
            }
        });

        executorService.submit(() -> {
            while (true) {
                System.out.println(Thread.currentThread().getName() + " is coding in Java");
                MyThreadUtil.sleep(3000);
            }
        });
        executorService.submit(() -> {
            int count = 0;
            while (count < 5) {
                System.out.println(Thread.currentThread().getName() + " is coding in JS");
                MyThreadUtil.sleep(3000);
                count++;
            }
            System.out.println("******* I am done with coding in JS *****");
        });
        executorService.submit(() -> {
            while (true) {
                System.out.println(Thread.currentThread().getName() + " is coding in Rust");
                MyThreadUtil.sleep(3000);
            }
        });
    }
}
