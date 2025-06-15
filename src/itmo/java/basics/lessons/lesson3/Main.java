package itmo.java.basics.lessons.lesson3;

import itmo.java.basics.lessons.lesson2.Color;

import java.awt.*;
import java.time.LocalDate;

//import static itmo.java.basics.lesson3.StaticExample.STATIC_CONSTANT;
//import static itmo.java.basics.lesson3.StaticExample.printStaticVar;
import static itmo.java.basics.lessons.lesson3.StaticExample.*;

public class Main {
    public static void main(String[] args) {
//        String staticConstant = STATIC_CONSTANT;
//        System.out.println(staticConstant);

//        LocalDate date = null;

//        Color color = new Color();
//        itmo.java.basics.lesson2.Color color2 =  itmo.java.basics.lesson2.Color.RED;
//        printStaticVar();

        Sun sun = Sun.getInstance();
        sun.setSize(555);
        sun.setColor(Color.RED);

        Sun sun2 = Sun.getInstance();
        sun2.setSize(777);
        sun2.setColor(Color.WHITE);

        System.out.println(sun);
        System.out.println(sun2);
    }
}