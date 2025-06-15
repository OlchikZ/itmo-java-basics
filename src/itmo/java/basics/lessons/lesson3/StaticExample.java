package itmo.java.basics.lessons.lesson3;

public class StaticExample {
    private String string;
    Integer number;
    protected String protectedString;
    public String publicString;

    public static final String STATIC_CONSTANT = "static constant";
    public static String staticString;
    private final String nonStaticString;

    static {
        System.out.println("===========");
        System.out.println("static block start");
        staticString = "static-string";
//        nonStaticString =    <- нет доступа
        System.out.println(staticString);
        System.out.println("static block end");
        System.out.println("===========");
    }

    {
        System.out.println("===========");
        System.out.println("non-static block start");
//        staticString = "static-string";
        nonStaticString =  "non-static-string";
        System.out.println(staticString);
        System.out.println("non-static block end");
        System.out.println("===========");
    }

//    public StaticExample() {
//        System.out.println("constructor");
//    }

    public static void main(String[] args) {
//        new StaticExample();

//        StaticExample staticExample = null;
//        staticExample.someMethod();
//
//        Integer integer = null;
//        String number = "123";
//
////        int i = integer.parseInt(number);  // некорректный вызов
//
//        int x = Integer.parseInt(number);
//
////        System.out.println(i);
//        System.out.println(x);

        printStaticVar();

    }

    public void someMethod() {
        printStaticVar();
    }

    public static void printStaticVar() {
//        someMethod();  <- либо через создание нового объекта, либо сделать метод статическим
        System.out.println(staticString);
    }

}