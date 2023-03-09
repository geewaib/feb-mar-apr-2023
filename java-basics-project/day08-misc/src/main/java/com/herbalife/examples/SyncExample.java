package com.herbalife.examples;

import static com.herbalife.examples.MyThreadUtil.*;

public class SyncExample {
    public static void main(String[] args) {
        final Counter counter = new Counter();
        Thread incrementingThread = new Thread(() -> {
            while (true) {
                counter.increment();
                sleep(1000);
            }
        });
        Thread decrementingThread = new Thread(() -> {
            while (true) {
                counter.decrement();
                sleep(1000);
            }
        });
        Thread printingThread = new Thread(() -> {
            while (true) {
                System.out.println("Counter value: " + counter.getValue());
                sleep(1000);
            }
        });
        incrementingThread.start();
        decrementingThread.start();
        printingThread.start();
    }
}

class Counter {
    private int value;

    public void increment() {
        synchronized (this) {
            value++;
        }
    }

    public synchronized void decrement() {
        value--;
    }

    public synchronized int getValue() {
        return value;
    }
}