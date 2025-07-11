package itmo.java.basics.lessons.lesson11.decorator;

public class Main {
    public static void main(String[] args) {
        Decorator c = new DecoratorHello(new DecoratorComma(new DecoratorSpace(new MainComponent())));
        c.doOperation(); // Результат выполнения программы "Hello, World!"
        c.newOperation(); // New hello operation

//        Decorator decoratorComma = new DecoratorComma(new MainComponent());
//        System.out.println(decoratorComma);

    }

    // 1    --->
    // 2   --->        AggregatedObject
    // 3   --->


}
