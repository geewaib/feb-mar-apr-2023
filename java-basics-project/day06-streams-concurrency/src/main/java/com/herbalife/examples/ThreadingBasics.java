package com.herbalife.examples;

public class ThreadingBasics {
    public static void main(String[] args) {
        //Create an instance of Thread class
        //Thread class takes in an implementation of Runnable interface where you specify the actual work
        //Call start on the Thread instance

        Thread coderThread = new Thread(new CodingJob());
        coderThread.start();

        Thread modernCoderThread = new Thread(() -> {
            while(true) {
                System.out.println("Search StackOverflow, ChatGPT; Copy-Paste; Modify it");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        modernCoderThread.start();
    }
}
class CodingJob implements Runnable {
    public void run() {
        while(true) {
            System.out.println("Writing code...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}