package itmo.java.basics.hw.hw7;

public class Main {
    public static void main(String[] args) {
        AirPlane plane = new AirPlane();

        // Крыло 1 — вес 1500 кг
        AirPlane.Wing leftWing = plane.new Wing(1500);
        leftWing.printWeight();

        // Крыло 2 — вес 1700 кг
        AirPlane.Wing rightWing = plane.new Wing(1700);
        rightWing.printWeight();
    }
}
