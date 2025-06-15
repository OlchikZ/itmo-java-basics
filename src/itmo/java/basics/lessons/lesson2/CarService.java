package itmo.java.basics.lessons.lesson2;

public class CarService {
    public static long totalPrice(Car car, Integer servicePrice) {
        if (servicePrice == null) {
            return car.getPrice();
        }
        return car.getPrice() + servicePrice;
    }
}