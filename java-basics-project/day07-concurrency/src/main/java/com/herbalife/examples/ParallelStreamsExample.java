package com.herbalife.examples;

import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

import static com.herbalife.examples.MyThreadUtil.*;

public class ParallelStreamsExample {
    public static void main(String[] args) {
        //Streams process items sequentially
        //Parallel streams internally creates a forkjoinpool of threads = (numberOfCores - 1)
        ForkJoinPool forkJoinPool = new ForkJoinPool(100);


        forkJoinPool.submit(() -> {
            IntStream.
                    range(1, 1000)
                    .parallel()
                    .filter(num -> {
                        sleep(1000);
                        System.out.println("Filtering " + num + " on " + name());
                        return num % 2 == 0;
                    })
                    .forEach(num -> {
                        System.out.println(num);
                    });
        });
        sleep(20000);
    }
}
