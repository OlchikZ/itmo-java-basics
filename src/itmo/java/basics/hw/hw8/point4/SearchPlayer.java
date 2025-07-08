package itmo.java.basics.hw.hw8.point4;

import java.util.Map;

public class SearchPlayer {

    public static void searchPlayer(Map<User, Integer> map, String inputName) {
        User key = new User(inputName); // создаём ключ

        if (map.containsKey(key)) {
            int score = map.get(key);
            System.out.println("Очки игрока " + inputName + ": " + score);
        } else {
            System.out.println("Участника с таким именем нет.");
        }
    }
}

