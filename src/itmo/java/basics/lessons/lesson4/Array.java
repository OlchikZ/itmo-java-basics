package itmo.java.basics.lessons.lesson4;

import itmo.java.basics.lessons.lesson2.Car;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] ints = new int[10];

        ints[0] = 20;
        ints[1] = 321;
        ints[2] = 123;
        ints[3] = 44;
        ints[4] = 5;
        ints[5] = 78;

//        System.out.println(Arrays.toString(ints));

        String[] strings = new String[5];
//        System.out.println(Arrays.toString(strings));

        long[] longs = new long[]{122L, 321L, 333L};
        long[] longs2 = {122L, 321L, 333L};

//        System.out.println(Arrays.toString(longs));
//        System.out.println(Arrays.toString(longs2));


        Car[] cars = new Car[3];
        cars[0] = new Car("BMW", "X3");
        cars[1] = new Car("Audi", "A6");
        cars[2] = new Car("Mercedes", "e200");

//        System.out.println(Arrays.toString(cars));

//        int a = 5;
//        int b = 15;
//        int c = 25;
//
//        int[][][] arr =  new int[a][b][c];

//        for (int i = 0; i < longs.length; i++) {
////            i = i + 1 ==  i++;
//            if (longs[i] % 2 == 0) {
//                System.out.println(longs[i]);
//            }
//        }
//
//        for (Car car : cars) {
//            if (car.getBrand().equals("BMW")) {
//                System.out.println(car);
//            }
//        }

        int x = 0;

//        do {
//            //logic
//            System.out.println(++x);
//        } while (x != 1);

//        while (x != 5) {
//            x++;
//            if (x < 2) {
//                continue;
//            }
//
//
//            System.out.println(x);
//
//           if (x == 3) {
//               break;
//           }
//
//        }
//        varargMethod(123, "Hello!");
//        varargMethod(123, "Hello!", "world", "!");

        System.out.println(Arrays.toString(ints));
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        int i = Arrays.binarySearch(ints, 44);
        int j = Arrays.binarySearch(ints, 45);

        System.out.println(i);
        System.out.println(j);

    }

    public static  void  someMethod(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void  varargMethod(int num, String... line ) {
        for (String s : line) {

        }

        System.out.println(Arrays.toString(line));
    }
}