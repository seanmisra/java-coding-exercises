package org.example;

public class App {
    static public void main(String... args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread myThread = new Thread(myRunnable);
        myThread.start();

        MyThread myThreadTwo = new MyThread();
        myThreadTwo.start();
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("running 1...");
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("running 2...");
    }
}