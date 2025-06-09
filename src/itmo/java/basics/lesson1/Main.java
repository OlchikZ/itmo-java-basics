package itmo.java.basics.lesson1;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world");


        String str = null;

        var number = 123L;

        byte b = 100;
        short s = 123;
        int i = 100;
        long l = 50000000000L;
        float f = 12.3f;
        double d = 14.5;
        boolean isTrue = true;
        var c = 'a';

//        byte x = (byte)(b +i); //переполнение переменной

        int a = 3;
        int z;

        if (a == 3) {
            z = 100;
        } else {
            z = 50;
        }

        z = a == 3 ? 100 : 50;

        z = a == 3 ? x == 11 ? 25 : 100 : 50;

    }
}
