package itmo.java.basics.hw.hw10.point1;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Thread thread = new Thread(new MyRunnable(), "Поток-" + i);
            thread.start();
        }
    }
}