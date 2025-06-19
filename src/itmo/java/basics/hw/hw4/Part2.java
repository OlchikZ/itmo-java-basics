package itmo.java.basics.hw.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] agrs) {
        //point1();
        //point2();
        //point3();
        point4();
    }

    public static void point1() {
        System.out.println("Point 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива. Длинна массива должна быть больше или равна 2 ");
        int length = scanner.nextInt();

        if (length < 2) {
            System.out.println("Ошибка: длина массива должна быть не меньше 2.");
            return;
        }

        int[] ints = new int[length];
        boolean isSorted = true;

        System.out.print("Введите 0 элемент: ");
        ints[0] = scanner.nextInt();

        for (int i = 1; i < length; i++) {
            System.out.print("Введите " + i + " элемент: ");
            ints[i] = scanner.nextInt();

            if (ints[i - 1] > ints[i]) {
                isSorted = false;
            }
        }

        System.out.println("array = " + Arrays.toString(ints));
        System.out.println(isSorted ? "OK" : "Please, try again");
    }

    public static void point2() {
        System.out.println("Point 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int length = scanner.nextInt();
        int[] ints = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Введите " + i + " элемент: ");
            ints[i] = scanner.nextInt();
        }
        System.out.println("Result = " + Arrays.toString(ints));
    }

    public static void point3() {
        System.out.println("Point 3");

        int[] array = {5, 6, 7, 2};
        System.out.println("Array 1: " + Arrays.toString(array));

        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        System.out.println("Array 2: " + Arrays.toString(array));
    }

    public static void point4() {
        System.out.println("Point 4");

        int[] array = {1, 2, 3, 1, 2, 4};
        System.out.println("Array: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.println("Первое уникальное число: " + array[i]);
                return;
            }
        }

        System.out.println("Уникальных чисел не найдено.");
    }
}

