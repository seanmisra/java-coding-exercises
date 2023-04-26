package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App {
    private int counter = 0;
    private static final int NUMB_THREADS = 50;
    private static final int COUNTER_END = 1000;

    static public void main(String... args)  {
        App myApp = new App();
        myApp.runThreads();
    }

    void runThreads() {
        ExecutorService es = Executors.newFixedThreadPool(NUMB_THREADS);
        for (int i = 1; i <= COUNTER_END; i++) {
            es.execute(() -> {
                this.increment();
            });
        }

        es.shutdown();
        try {
            if (es.awaitTermination(5, TimeUnit.SECONDS)) {
                System.out.println("terminated");
                System.out.println("counter:" + this.counter);
            } else {
                es.shutdownNow();
            }
        } catch (InterruptedException e) {
            es.shutdownNow(); // in case of error still shutdown
        }
    }

    // if you remove synchronized, the final result of the counter will vary
    // ++ is not atomic
    synchronized void increment() {
        this.counter++;
    }
}