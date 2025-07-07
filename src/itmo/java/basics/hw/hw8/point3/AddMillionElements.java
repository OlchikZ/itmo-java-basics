package itmo.java.basics.hw.hw8.point3;

import java.util.List;
import java.util.Random;

public class AddMillionElements {
    public static void addMillionElements (List<Integer> list){
        int listSize = 1000000;
        Random random = new Random();
        for (int i = 0; i < listSize; i++) {
            list.add(random.nextInt());
        }
        System.out.println("Размер списка: " + list.size());
    }
}
