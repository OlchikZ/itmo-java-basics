package itmo.java.basics.lessons.lesson13;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("My runnable is running " + Thread.currentThread().getName());
            i++;
        }
    }
}
