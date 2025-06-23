package itmo.java.basics.hw.hw6.point5;
import java.util.Scanner;

import java.util.Scanner;

public class BaseUser {
    protected Scanner scanner;

    public BaseUser() {
        scanner = new Scanner(System.in);
    }

    public void getInfo() {
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        System.out.println("Возраст: " + age);
    }
}

