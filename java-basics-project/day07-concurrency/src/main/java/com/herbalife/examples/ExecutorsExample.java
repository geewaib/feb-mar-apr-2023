package com.herbalife.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

import static com.herbalife.examples.MyThreadUtil.*;

public class ExecutorsExample {
    public static void main(String[] args) {
        //ExecutorService executorService = Executors.newFixedThreadPool(2);
        ExecutorService executorService = Executors.newCachedThreadPool();

        IntStream.range(1, 10).forEach(it -> {
            executorService.submit(() -> {
                while(true) {
                    System.out.println(name() + ": Writing code in Golang");
                    sleep(2000);
                }
            });
        });
        executorService.submit(() -> {
            while(true) {
                System.out.println(name() + ": Reviewing code");
                sleep(2000);
            }
        });
        executorService.submit(() -> {
            while(true) {
                System.out.println(name() + ": Writing code in JS");
                sleep(2000);
            }
        });
    }
}
