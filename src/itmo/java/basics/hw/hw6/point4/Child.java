package itmo.java.basics.hw.hw6.point4;

public class Child extends Head {

    public Child(int number) {
        super(number); // вызываем конструктор родительского класса
    }

    public void printNumber() {
        System.out.println("Число из главного класса: " + getNumber());
    }
}