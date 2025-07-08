package itmo.java.basics.hw.hw8.point3;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ReadElements {
    public static void readElements (List<Integer> list){
        int iteration = 1000000;
        Random random = new Random();

        for (int i = 0; i < iteration; i++) {
            int index = random.nextInt(list.size());
            int value = list.get(index);
        }
    }
}
