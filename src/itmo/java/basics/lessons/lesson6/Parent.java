package itmo.java.basics.lessons.lesson6;

public class Parent {
    private String name;
    private String surname;

    public Parent(String name) {
        this.name = name;
    }

    public Parent(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void print() {
        System.out.println("Method from " + this.getClass().getSimpleName() + " class");
    }

//    public final void someMethod() {
//
//    }

//    private void someMethod() {
//
//    }

}