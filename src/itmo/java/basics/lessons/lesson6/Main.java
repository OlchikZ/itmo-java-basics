package itmo.java.basics.lessons.lesson6;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        for (Field declaredField : car.getClass().getDeclaredFields()) {
////            declaredField.getAnnotation(Deprecated.class);
////            System.out.println(declaredField);
////            declaredField.setAccessible(true);
//        }

//        Object object = new Object();


        Parent parent = new Parent("");
        Parent child = new Child("");
        Parent anotherChild = new AnotherChild("");

//        parent.print();
//        child.print();
//        anotherChild.print();

//        Child child1 = new Parent();
//
//        ((Child)parent).print(); // <- ClassCastException
//
//        if (child instanceof  Parent) {
//            System.out.println("OK!");
//        }

//        Moveable car = new Car();
//        Moveable bus = new Bus();

//        Moveable moveable = new Moveable();  создание невозможно
//
//        printTransportName(car);
//        printTransportName(bus);

        Transport plane = new Plane(10000, 200, true);
        Transport bus = new Bus(2000, 5, false);


        printTransportName(plane);
        printTransportName(bus);
    }


    public static void printTransportName(Moveable transport) {
        transport.printTransportName();
    }


    public static void printTransportName(Transport transport) {
        transport.printTransportName();
    }
}