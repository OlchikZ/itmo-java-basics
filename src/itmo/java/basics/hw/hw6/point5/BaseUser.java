package itmo.java.basics.hw.hw6.point5;
import java.util.Scanner;

public class BaseUser {
    protected Scanner scanner; // protected — доступен в наследниках

    public BaseUser() {
        scanner = new Scanner(System.in);
    }

    public int getAge() {
        System.out.print("Введите ваш возраст: ");
        return scanner.nextInt();
    }

    public String getName() {
        System.out.print("Введите ваше имя: ");
        return scanner.next();
    }
}

