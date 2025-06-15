package itmo.java.basics.hw2;

public class Main {
    public static void main (String[] args) {
        point1();
        point2();
    }

    public static void point1() {
        System.out.println("Point 1");
        Calculator calculator = new Calculator();

        // СУММА
        System.out.println("Сумма (int): " + calculator.sum(2, 3));
        System.out.println("Сумма (long): " + calculator.sum(10000000000L, 5000000000L));
        System.out.println("Сумма (double): " + calculator.sum(2.5, 3.7));

        // ВЫЧИТАНИЕ
        System.out.println("Вычитание (int): " + calculator.subtract(10, 4));
        System.out.println("Вычитание (long): " + calculator.subtract(5000000000L, 3000000000L));
        System.out.println("Вычитание (double): " + calculator.subtract(5.5, 2.2));

        // УМНОЖЕНИЕ
        System.out.println("Умножение (int): " + calculator.multiply(3, 7));
        System.out.println("Умножение (long): " + calculator.multiply(100000L, 30000L));
        System.out.println("Умножение (double): " + calculator.multiply(1.5, 2.5));

        // ДЕЛЕНИЕ
        System.out.println("Деление (int): " + calculator.divide(10, 2));
        System.out.println("Деление (long): " + calculator.divide(2L, 10000000000L));
        System.out.println("Деление (double): " + calculator.divide(7.5, 2.5));
    }

    public static void point2(){
        System.out.println("");
        System.out.println("Point 2");
        Book book1 = new Book();
        book1.printInfo();

        System.out.println("");

        Book book2 = new Book("Фрэнк Герберт", "Дюна", 799.99, 701, "Русский");
        book2.printInfo();

    }
}
