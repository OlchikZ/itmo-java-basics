package itmo.java.basics.hw.hw8.point2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Барсик", 2));
        cats.add(new Cat("Мурка", 3));
        cats.add(new Cat("Вася", 2));
        cats.add(new Cat("Аленка", 3));
        cats.add(new Cat("Барсик", 2)); // дубликат

        Set<Cat> uniqueCats = CatCollection.sortOfCats(cats);
        System.out.println("Коты без дубликатов: " + uniqueCats);
    }
}