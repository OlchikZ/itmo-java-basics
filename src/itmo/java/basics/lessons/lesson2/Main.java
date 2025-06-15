package itmo.java.basics.lessons.lesson2;
import static itmo.java.basics.lessons.lesson2.CarService.totalPrice;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("LADA", "VESTA");

//        System.out.println(lada);

        String brand = lada.getBrand();
//        System.out.println(brand);

        lada.setDoorsCount(5);
//        System.out.println(lada);

        lada.setPrice(50000L);
//        long totalPrice = totalPrice(lada, null);
//        System.out.println(totalPrice);

        lada.setColor(Color.DEEP_BLUE);

        System.out.println(lada.getColor().getCode());
        System.out.println(lada.getColor().getDescription());
    }


//    public void someMethod() {
//        int x;
//        String str;
//
//        if (true) {
//            x = 2;
//        } else {
//            x = 1;
//        }
//
//        System.out.println(x);
//    }


    public String overloadedMethod() {
        return  null;
    }


    public String overloadedMethod(Integer integer) {
        return  null;
    }


    public String overloadedMethod(Integer integer, Color color) {
        return  null;
    }


    public Long overloadedMethod(Integer integer, Color color, Long sum) {
        return  null;
    }

    public void overloadedMethod(Long sum) {

    }
}