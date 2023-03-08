package com.herbalife.examples;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

import static com.herbalife.examples.MyThreadUtil.*;

public class CompletableFutureExample {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);

        Supplier<Integer> randomGenerator = () -> {
            sleep(5000);
            return (int) (Math.random() * 100);
        };
        //Similar to Promises in JS
        CompletableFuture
                .supplyAsync(randomGenerator, service)
                .thenApply(response -> "Random number is " + response)
                .thenAccept(response -> System.out.println(response));
        System.out.println("End of main");


        CompletableFuture
                .supplyAsync(() -> {
                    sleep(5000);
                    return (int) (Math.random() * 100);
                })
                .thenApply(response -> "Random number is " + response)
                .thenAccept(response -> System.out.println(response));


        sleep(20000); //To avoid main thread to end
    }
}
