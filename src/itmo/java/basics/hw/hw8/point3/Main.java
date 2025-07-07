package itmo.java.basics.hw.hw8.point3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integersArray = new ArrayList<>();
        AddMillionElements.addMillionElements(integersArray);
        TimeCheck.timeCheck(integersArray);

        List<Integer> integersLinked = new LinkedList<>();
        AddMillionElements.addMillionElements(integersLinked);
        TimeCheck.timeCheck(integersLinked);


/*      ArrayList быстрее, потому что список не связанный.
        А в LinkedList каждый вызов get(i) пробегает от начала до нужного элемента. */
    }
}
