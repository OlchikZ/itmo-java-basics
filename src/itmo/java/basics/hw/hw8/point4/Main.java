package itmo.java.basics.hw.hw8.point4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<User, Integer> gameTable = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Добавление игроков
        gameTable.put(new User("John"), 41492);
        gameTable.put(new User("Alice"), 2354);
        gameTable.put(new User("Katie"), 5221);
        gameTable.put(new User("Mike"), 53563);
        gameTable.put(new User("Tom"), 25253);


        for (User user : gameTable.keySet()) {
            System.out.println(user.getName());
        }

        // Чтение имени с консоли
        System.out.print("Введите имя пользователя, чтобы узнать его уровень: ");
        String inputName = scanner.nextLine();
        SearchPlayer.searchPlayer(gameTable, inputName);
    }
}
