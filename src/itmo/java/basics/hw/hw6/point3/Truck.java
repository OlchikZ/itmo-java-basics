package itmo.java.basics.hw.hw6.point3;

public class Truck extends Car {
    public int numberOfWheels;
    public double maxWeight;

    // Метод, устанавливающий новое значение колёс
    public void newWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
        System.out.println("Количество колес: " + numberOfWheels);
    }

    // Конструктор, вызывающий родительский и устанавливающий свои поля
    public Truck(int w, String m, char c, float s, int numberOfWheels, double maxWeight) {
        super(w, m, c, s);
        this.numberOfWheels = numberOfWheels;
        this.maxWeight = maxWeight;
    }
}
