package itmo.java.basics.lessons.lesson6;

public class AnotherChild extends Parent {
    public AnotherChild(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("Call from AnotherChild");
    }
}
