package com.herbalife.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HowManyThreads {
    public static void main(String[] args) {
        int numberOfCores = Runtime.getRuntime().availableProcessors();
        System.out.println(numberOfCores);

        //number of threads = number of cores /(1 - blockingFactor)
        //blockingFactor 0 < 1
        //CPU intensive 0 < 0.5  (usually the simple formula is numberOfCores - 1)
        //IO intensive 0.5 < 0.9

        //Loop through a collection of data and Store each of them in a DB
        int numberOfThreadsForDBOperation = (int)(numberOfCores / (1 - 0.9));
        System.out.println(numberOfThreadsForDBOperation);
        ExecutorService executorServiceForDb = Executors.newFixedThreadPool(numberOfThreadsForDBOperation);

        //Complex recursive algorithm
        int numberOfThreadsForRecursiveAlgorithm = (int)(numberOfCores / (1 - 0.2));
        System.out.println(numberOfThreadsForRecursiveAlgorithm);

    }
}
