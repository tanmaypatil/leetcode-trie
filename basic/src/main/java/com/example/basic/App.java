package com.example.basic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
        String threadName = Thread.currentThread().getName();
        System.out.println("Hello " + threadName);
        System.out.println("shutting down " + threadName);
        });
        executor.shutdownNow();
      
    }
}
