package itmo.java.basics.hw.hw10.point4;

public class Main {
    public static void main(String[] args) {
        Object monitor = new Object();
        Counter counter = new Counter();
        int maxCount = 10;

        Thread printer1 = new NamedPrinter("Поток-1", monitor, counter, maxCount);
        Thread printer2 = new NamedPrinter("Поток-2", monitor, counter, maxCount);

        printer1.start();
        printer2.start();
    }
}

