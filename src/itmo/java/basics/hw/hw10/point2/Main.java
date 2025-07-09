package itmo.java.basics.hw.hw10.point2;

import itmo.java.basics.hw.hw10.point1.MyRunnable;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable(), "Поток-1");
        System.out.println("Состояние до запуска: " + thread.getState());
        thread.start();

        Thread.sleep(10);
        System.out.println("Состояние после запуска: " + thread.getState());

        thread.join();
        System.out.println("Состояние после завершения: " + thread.getState());
    }
}
