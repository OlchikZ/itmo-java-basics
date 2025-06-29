package itmo.java.basics.lessons.lesson7;

import itmo.java.basics.lessons.lesson6.Moveable;

public class Main {
    public static void main(String[] args) {
//        OuterClass.InnerClass innerClass = new OuterClass.InnerClass(); создание невозможно

//        OuterClass outerClass = new OuterClass();
//        outerClass.innerClassMethodCall();

//        OuterClass.NestedStaticClass nestedStaticClass = new OuterClass.NestedStaticClass();
//        nestedStaticClass.nestedStaticClassMethod();

        Moveable car = new Moveable() {
            @Override
            public void printTransportName() {
                System.out.println(transportName());
            }

            @Override
            public String transportName() {
                return "BMW";
            }
        };

        car.printTransportName();
    }
}