package itmo.java.basics.lessons.lesson13;

public class ThreadExample extends Thread {
    public ThreadExample() {
        this.start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " passes itself queue to the next thread");
        Thread.yield();
        System.out.println(Thread.currentThread().getName() + " has finished executing");
    }
}
