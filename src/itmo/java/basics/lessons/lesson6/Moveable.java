package itmo.java.basics.lessons.lesson6;

import java.io.Serializable;

public interface Moveable extends Interface, Serializable {
    public static final String NAME = "Brand";

    public abstract void printTransportName();

    public abstract String transportName();

    public default void someMethod() {
        System.out.println("someMethod");
    }

    public static void staticMethod() {

    }

    private static void privateStaticMethod() {

    }
}
