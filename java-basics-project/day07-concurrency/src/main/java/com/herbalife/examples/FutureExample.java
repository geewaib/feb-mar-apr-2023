package com.herbalife.examples;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import static com.herbalife.examples.MyThreadUtil.*;

public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Future is an entity that refers to the value returned by a thread

        ExecutorService service = Executors.newFixedThreadPool(2);

        Future<Integer> randomFuture = service.submit(() -> {
            sleep(5000);
            return (int) (Math.random() * 100);
        });
        System.out.println("Random number: " + randomFuture.get()); //BLOCKING CALL  await ....
        System.out.println("End of main");



//        while(!randomFuture.isDone()) {
//            System.out.println("Computing random number");
//            sleep(1000);
//        }
//        System.out.println("Random number is " + randomFuture.get());

        service.shutdownNow();
    }
}
