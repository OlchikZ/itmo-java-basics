package itmo.java.basics.hw.hw6.point3;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck(5000, "Volvo", 'B', 80.5f, 8, 12000.0);
        truck.outPut();
        truck.newWheels(10);
    }
}