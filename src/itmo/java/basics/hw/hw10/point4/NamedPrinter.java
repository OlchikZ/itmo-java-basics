package itmo.java.basics.hw.hw10.point4;

public class NamedPrinter extends Thread {
    private final Object monitor;
    private final Counter counter;
    private final int maxCount;

    public NamedPrinter(String name, Object monitor, Counter counter, int maxCount) {
        super(name);
        this.monitor = monitor;
        this.counter = counter;
        this.maxCount = maxCount;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (monitor) {
                if (counter.getValue() >= maxCount) {
                    monitor.notify(); // разбудим второй поток, если он ждёт
                    break;
                }

                System.out.println(getName());
                counter.increment();

                monitor.notify(); // разбудим другой поток

                try {
                    monitor.wait(); // уступим очередь
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

