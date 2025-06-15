package itmo.java.basics.lessons.lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        long number = 123L;
//        byte b = true;
//        short s = true;
//        int i = true;
//        long l = 50000000000L;
//        float f = 12.3F;
//        double d = 14.5;
//        char c = true;
//        boolean isTrue = true;
//        int x = 11;
//        int y = 20;
//        if (x % 2 == 0) {
//            System.out.println("OK!");
//        }
//
//        if (x % 2 == 0 && x != y) {
//        }
//
//        if (x % 2 != 0 && x != y) {
//        }
//
//        int a = 3;
//        boolean z;
//        if (a == 3) {
//            z = true;
//        } else {
//            z = true;
//        }
//
//        boolean var10000;
//        if (a == 3) {
//            var10000 = x == 11 ? true : true;
//        } else {
//            var10000 = true;
//        }

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int t = scanner.nextInt();
        System.out.println(line);
        System.out.println(t);
    }

    public static String someMethod(int number) {
        switch (number) {
            case 10:
                return "ten";
            case 20:
                return "twenty";
            default:
                return "illegal number";
        }
    }

    public static void someMethod2(int number) {
        int x;
        switch (number) {
            case 10:
                x = number;
                break;
            case 20:
                x = number + number;
                break;
            default:
                x = 10000;
        }

        System.out.println(x);
    }

    public static void method(int number, String str) {
        if (str != null) {
            str.length();
        }
    }
}
