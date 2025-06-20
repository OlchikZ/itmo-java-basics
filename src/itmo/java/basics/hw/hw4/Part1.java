package itmo.java.basics.hw.hw4;


import java.util.Arrays;
import java.util.Scanner;

public class Part1 {
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
        for (int i = 1; i <= 99; i += 2) {
            System.out.println(i);
        }
    }

    public static void point2() {
        System.out.println("Point 2");
        StringBuilder by3 = new StringBuilder();
        StringBuilder by5 = new StringBuilder();
        StringBuilder by3and5 = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                by3and5.append(i).append(", ");
            } else if (i % 3 == 0) {
                by3.append(i).append(", ");
            } else if (i % 5 == 0) {
                by5.append(i).append(", ");
            }
        }

        by3.setLength(by3.length() - 2);
        by5.setLength(by5.length() - 2);
        by3and5.setLength(by3and5.length() - 2);

        System.out.println("Делятся на 3: " + by3);
        System.out.println("Делятся на 5: " + by5);
        System.out.println("Делятся на 3 и на 5: " + by3and5);
    }

    public static boolean isSumEqualToThird(int a, int b, int c) {
        return a + b == c;
    }

    public static void point3() {
        System.out.println("Point 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int num1 = scanner.nextInt();

        System.out.println("Введите второе число ");
        int num2 = scanner.nextInt();

        System.out.println("Введите третье число ");
        int num3 = scanner.nextInt();

        boolean result = isSumEqualToThird(num1, num2, num3);
        System.out.println("Результат: " + result);
    }

    public static boolean isThirdBiggest(int a, int b, int c) {
        return a > b && c > b;
    }
    public static void point4() {
        System.out.println("Point 4");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int num1 = scanner.nextInt();

        System.out.println("Введите второе число ");
        int num2 = scanner.nextInt();

        System.out.println("Введите третье число ");
        int num3 = scanner.nextInt();

        boolean result = isThirdBiggest(num1, num2, num3);
        System.out.println("Результат: " + result);
    }

    public static boolean isThreeFirstOrLast(int a, int b) {
        return a == 3 || b == 3;
    }

    public static void point5(){
        System.out.println("Point 5");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива. Длинна массива должна быть больше или равна 2 ");
        int length = scanner.nextInt();

        if (length < 2) {
            System.out.println("Ошибка: длина массива должна быть не меньше 2.");
            return;
        }
        int[] ints = new int[length];
        for (int i = 0; i < ints.length; i++) {
            System.out.println("Введите " + i + " элемент: ");
            ints[i] = scanner.nextInt();
        }

        boolean result = isThreeFirstOrLast(ints[0], ints[length-1]);
        System.out.println("array = " + Arrays.toString(ints));
        System.out.println("Результат " + result);
    }

    public static void point6(){
        System.out.println("Point 6");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива. Длинна массива должна быть больше или равна 2 ");
        int length = scanner.nextInt();

        if (length < 2) {
            System.out.println("Ошибка: длина массива должна быть не меньше 2.");
            return;
        }
        int[] ints = new int[length];
        boolean result = false;
        for (int i = 0; i < ints.length; i++) {
            System.out.println("Введите " + i + " элемент: ");
            ints[i] = scanner.nextInt();
            if (ints[i] == 1 || ints[i] == 3) {
                result = true;
            }
        }

        System.out.println("array = " + Arrays.toString(ints));
        System.out.println("Результат " + result);
    }
}
