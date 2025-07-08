package itmo.java.basics.hw.hw8.point3;

import java.util.List;

import static itmo.java.basics.hw.hw8.point3.ReadElements.readElements;

public class TimeCheck {
    public static void timeCheck(List<Integer> list) {
        long start = System.nanoTime();
        ReadElements.readElements(list);
        long end = System.nanoTime();
        System.out.println("Время: " + (end - start)/ 1000000.0 + " ms");
    }
}
