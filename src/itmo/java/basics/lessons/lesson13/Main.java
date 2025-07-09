package itmo.java.basics.lessons.lesson13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // CountDownLatch
//        Thread myRunnable = new Thread(new MyRunnable());
//        MyThread myThread = new MyThread();
//
//        myRunnable.start();
////        myRunnable.run();
//
//        try {
//            myRunnable.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        myThread.start();
//
//        myThread.interrupt();
//
//        if (myThread.isInterrupted()) {
//
//        }
//
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }


//        new ThreadExample();
//        new ThreadExample();
//        new ThreadExample();
//        new ThreadExample();
//        new ThreadExample();

        ExecutorService executorService = Executors.newFixedThreadPool(200);

    }
}