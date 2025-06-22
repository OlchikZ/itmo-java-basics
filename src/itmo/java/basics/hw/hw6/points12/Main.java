package itmo.java.basics.hw.hw6.points12;

import itmo.java.basics.hw.hw6.points12.BankRelated;
import itmo.java.basics.hw.hw6.points12.BankWorker;
import itmo.java.basics.hw.hw6.points12.Client;
import itmo.java.basics.hw.hw6.points12.Human;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human client = new Client("Ольга", "Миронова", "Сбербанк");
        Human worker = new BankWorker("Иван", "Смирнов", "Альфа-Банк");

        client.printInfo();
        worker.printInfo();

        exampleOfUsingInterface();
    }

    public static void exampleOfUsingInterface() {
        System.out.println("Пример использования интерфейса");
        List<BankRelated> people = List.of(
                new Client("Ольга", "Кириллова", "Тинькофф"),
                new BankWorker("Андрей", "Петров", "Тинькофф")
        );

        for (BankRelated person : people) {
            System.out.println("Объект связан с банком: " + person.getBankName());
        }
    }
}
