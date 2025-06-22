package itmo.java.basics.lessons.lesson6;

public class Child extends Parent {
    private Integer age;

    public Child(String name) {
        super(name);
    }

    public Child(String name, String surname, Integer age) {
        super(name, surname);
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println("Call from Child");
    }

//    @Override
//    public void someMethod() {
//
//    }
}
