package com.herbalife.labs.lab11;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

public class Lab11 {
    public static ForkJoinPool forkJoinPool;

    static {
        forkJoinPool = new ForkJoinPool((int) (Runtime.getRuntime().availableProcessors() / (1 - 0.9)));
    }

    public static void main(String[] args) throws Exception {
        MovieDetailsFetcher movieDetailsFetcher = new MovieDetailsFetcher();
        List<String> movieNames = Files.readAllLines(Paths.get("./movies.txt"));
        Future<Boolean> resultFuture = forkJoinPool.submit(() -> movieDetailsFetcher.loadMovieDetails(movieNames));
        while (!resultFuture.isDone()) {
            System.out.println("Fetching movies ...");
            sleep(100);
        }
        forkJoinPool.shutdownNow();
    }

    static void sleep(long ms) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
