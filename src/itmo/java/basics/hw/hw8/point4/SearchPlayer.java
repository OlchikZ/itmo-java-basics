package itmo.java.basics.hw.hw8.point4;

import java.util.Map;

public class SearchPlayer {

    public static void searchPlayer(Map<User, Integer> map, String inputName) {
        boolean found = false;

        for (User user : map.keySet()) {
            if (user.getName().equalsIgnoreCase(inputName)) {
                System.out.println("Очки игрока " + user.getName() + ": " + map.get(user));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Участника с таким именем нет.");
        }
    }
}

