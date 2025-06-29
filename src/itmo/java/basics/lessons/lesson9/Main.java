package itmo.java.basics.lessons.lesson9;

import itmo.java.basics.lessons.lesson6.Child;
import itmo.java.basics.lessons.lesson6.Parent;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
//
//        list.add(123);
//        list.add("String");
//        list.add(true);
//        list.add(new Car());
//
//        System.out.println(list);
//
        List<String> strings = new ArrayList<>();
        strings.add("String");
        strings.add("123");
        strings.add("true");

//        for (String string : strings) {
//            System.out.println(string);
//        }
//
        strings.add(2, "Hello");
//        System.out.println(strings);
//
//        Collections.sort(strings);
//        System.out.println(strings);
//        Collections.reverse(strings);
//        System.out.println(strings);

//        for (int i = 0; i < strings.size(); i++) {
//            strings.get(i);
//        }


        List<Integer> integers = new ArrayList<>();
        integers.add(55);
        integers.add(123);
        integers.add(123);
        integers.add(123);
        integers.add(123);
        integers.add(123);
        integers.add(123);
        integers.add(123);
        integers.add(123);
        integers.add(455);
        integers.add(53);
        integers.add(3368);
        integers.add(3368);
        integers.add(3368);
        integers.add(3368);
        integers.add(3368);
        integers.add(3368);
        integers.add(3368);
        integers.add(3368);
        integers.add(3368);
        integers.add(3368);
        integers.add(887);
        integers.add(1);
        integers.add(99);
        integers.add(56);
        integers.add(56);
        integers.add(56);
        integers.add(56);
        integers.add(56);
        integers.add(56);
        integers.add(56);
        integers.add(56);
        integers.add(32);
        integers.add(98);

//        System.out.println(integers);
//
//        integers.remove(Integer.valueOf(123));
//        System.out.println(integers);

//        for (Integer integer : integers) {
//            if (integer == 123) {
//                integers.remove(integer); // <- ConcurrentModificationException
//            }
//        }

//        Iterator<Integer> iterator = integers.iterator();
//        while (iterator.hasNext()) {
//            if (iterator.next() == 123) {
//                iterator.remove();
//            }
//        }
//
//        System.out.println(integers);
//
//        for (int i = 0; i < integers.size(); i++) {
//            if (integers.get(i) == 123) {
//                integers.remove(integers.get(i));
//            }
//        }
//
//        System.out.println(integers);

//        List<Long> longs = new ArrayList<>(10);


        List<Integer> ints = Arrays.asList(123, 33, 111, 543); // UnsupportedOperationException Java 8
//        ints.remove(Integer.valueOf(123));
//        System.out.println();


        List<Integer> ints2 = List.of(4545, 444, 232);  // Java 11
//        ints2.add(1323);

        List<Integer> unmodifiableList = Collections.unmodifiableList(integers);
//        unmodifiableList.add(343);


//        Parent parent = new Parent("");
//        Parent child = new Child("");
//        Parent anotherChild = new AnotherChild("");
//
//        print(parent);
//        print(child);
//        print(anotherChild);
//
//        List<Parent> parents = new ArrayList<>();
//        print(parents);
//
//        List<Child> children = new ArrayList<>();
//        List<AnotherChild> anotherChildren = new ArrayList<>();
//        print(children);
//        print(anotherChildren);
//
//        print2(parents);




//        Set<Car> cars = new HashSet<>();
//        for (int i = 0; i < 10; i++) {
//            cars.add(new Car());
//        }
//        System.out.println(cars);


        Set<String> set = new TreeSet<>();
        for (int i = 0; i < 100; i++) {
            set.add("Java");
        }

        set.add("String");
        set.add("777");
        set.add("world!");
        set.add("Hello");

//        System.out.println(set);
//
//
//        Set<Integer> uniques = new HashSet<>(integers);
//        System.out.println(uniques);

        //  key value
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 1231234);
        map.put("Alice", 87531234);
        map.put("Katie", 134552);
        map.put("Mike", 90234);
        map.put("Tom", 87531234);

//        map.put("Mike", 77777);

        System.out.println(map);

        Set<String> keySet = map.keySet();
        Collection<Integer> values = map.values();

        Integer number = map.get("Mike");
//        System.out.println(number);

        Integer alexNumber = map.getOrDefault("Alex", 0);
//        System.out.println(alexNumber);

        Set<String> keysByValue = getKeysByValue(map, 87531234);
//        int size = keysByValue.size();
//        System.out.println(keysByValue);

        Map<String, String> stringStringMap = Map.ofEntries(
                Map.entry("123", "333"),
                Map.entry("32", "333"),
                Map.entry("332", "333")
        );

        System.out.println(stringStringMap);
    }

    public static void print (Parent parent) {
        parent.print();
    }

    public static void print (List<? extends Parent> parents) {
        for (Parent parent : parents) {
            parent.print();
        }
    }

    public static void print2 (List<? super Child> children) {
        for (Object child : children) {
            if (child instanceof Child) {
                ((Child) child).print();
            } else if (child instanceof Parent) {
                ((Parent) child).print();
            }
        }
    }

    public static <T> void handleList(List<T> list) {

    }

    public static Set<String> getKeysByValue(final Map<String, Integer> map, Integer value) {
        Set<String> result = new HashSet<>();
        for(Map.Entry<String, Integer> pair : map.entrySet()) {
            String pairKey = pair.getKey();
            Integer pairValue = pair.getValue();
            if (pairValue.equals(value)) {
                result.add(pairKey);
            }
        }

        return result;
    }
}
