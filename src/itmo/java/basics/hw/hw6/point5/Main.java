package itmo.java.basics.hw.hw6.point5;

public class Main {
    public static void main(String[] args) {
        ExtendedUser user = new ExtendedUser();

        String name = user.getName(); // переопределённый метод
        int age = user.getAge();      // метод из родительского класса

        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}


