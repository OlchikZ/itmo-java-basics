package itmo.java.basics.hw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        point1();
        point2();
        point3();
        point4();
        point5();
        point6();
    }

    public static void point1() {
        System.out.println("Point 1");
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");
    }

    public static void point2() {
        System.out.println("");
        System.out.println("Point 2");
        double a = (46 + 10) * (10.0 / 3);
        System.out.println(a);
        double b = (29) * (4) * (-15);
        System.out.println(b);
    }

    public static void point3() {
        System.out.println("");
        System.out.println("Point 3");
        int number = 10500;
        double result = (number / 10.0) / 10;
        System.out.println(result);
    }

    public static void point4() {
        System.out.println("");
        System.out.println("Point 4");
        double number1 = 3.6;
        double number2 = 4.1;
        double number3 = 5.9;
        double result2 = number1 * number2 * number3;
        System.out.println(result2);
    }

    public static void point5() {
        System.out.println("");
        System.out.println("Point 5");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число");
        Integer num1 = scanner.nextInt();
        System.out.println("Введите второе целое число");
        Integer num2 = scanner.nextInt();
        System.out.println("Введите третье целое число");
        Integer num3 = scanner.nextInt();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }

    public static void point6() {
        System.out.println("");
        System.out.println("Point 6");
        System.out.println("Введите первое целое число");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();

        if (b % 2 != 0) {
            System.out.println("Нечетное");
        } else if (b > 100) {
            System.out.println("Выход за пределы диапазона");
        } else {
            System.out.println("Четное");
        }
    }
}
