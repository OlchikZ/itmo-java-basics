package itmo.java.basics.hw.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] agrs) {
        point1();
        point2();
        point3();
        point4();
    }

    public static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) return false;
        }
        return true;
    }

    public static void point1() {
        System.out.println("Point 1");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();

        if (length < 2) {
            System.out.println("Ошибка: длина массива должна быть не меньше 2.");
            return;
        }

        int[] array = new int[length];
        System.out.print("Введите 0 элемент: ");
        array[0] = scanner.nextInt();

        for (int i = 1; i < length; i++) {
            System.out.print("Введите " + i + " элемент: ");
            array[i] = scanner.nextInt();
        }

        System.out.println("array = " + Arrays.toString(array));
        if (isSorted(array)) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
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

    public static int[] swapFirstAndLast(int[] array) {
        if (array.length < 2) return array;

        int[] copy = Arrays.copyOf(array, array.length);
        int temp = copy[0];
        copy[0] = copy[copy.length - 1];
        copy[copy.length - 1] = temp;
        return copy;
    }

    public static void point3() {
        System.out.println("Point 3");
        int[] array = {5, 6, 7, 2};
        System.out.println("Array 1: " + Arrays.toString(array));
        int[] swapped = swapFirstAndLast(array);
        System.out.println("Array 2: " + Arrays.toString(swapped));
    }


    public static Integer findFirstUnique(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean IsUnique = true;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    IsUnique = false;
                    break;
                }
            }
            if (IsUnique) return array[i];
        }
        return null;
    }

    public static void point4() {
        System.out.println("Point 4");
        int[] array = {1, 2, 3, 1, 2, 4};
        System.out.println("Array: " + Arrays.toString(array));

        Integer result = findFirstUnique(array);
        if (result != null) {
            System.out.println("Первое уникальное число: " + result);
        } else {
            System.out.println("Уникальных чисел не найдено.");
        }
    }

}

