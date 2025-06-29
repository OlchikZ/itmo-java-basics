package itmo.java.basics.hw.hw7;

public class AirPlane {

    // Вложенный класс
    class Wing {
        private double wingWeight;

        public Wing(double wingWeight) {
            this.wingWeight = wingWeight;
        }

        public void printWeight() {
            System.out.println("Вес крыла: " + wingWeight + " кг");
        }
    }
}
