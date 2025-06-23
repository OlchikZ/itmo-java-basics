package itmo.java.basics.hw.hw6.point4;

import java.util.Scanner;

public class Head {
    protected int number;

    public Head() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        number = scanner.nextInt();
    }
}
