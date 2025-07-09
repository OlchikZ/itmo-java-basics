package itmo.java.basics.hw.hw10.point3;

public class Counter {
    int count = 0;

    //increment() не является потокобезопасным, 1 поток может переписать, поэтому добавила synchronized
    public synchronized void increment() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }
}
