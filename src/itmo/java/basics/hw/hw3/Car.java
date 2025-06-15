package itmo.java.basics.hw.hw3;

import itmo.java.basics.lessons.lesson2.Color;

class Car {
    private Color color;
    private String name;
    private Double weight;

    //Конструкторы
    public Car (Color color, String name, Double weight){
            this.name = name;
            this.color = color;
            this.weight = weight;
    }

    // только цвет машины;
    public Car (Color color){
        this.color = color;
    }

    // цвет и вес машины;
    public Car (Color color, Double weight){
        this.color = color;
        this.weight = weight;
    }

    // пустой
    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    }
    class Point2Program {
        public static void main(String[] args) {
            Car car1 = new Car(Color.GREEN, "Жигули", 311.0);
            Car car2 = new Car(Color.RED, "Ферари", 123.5);

            System.out.println(car1);
            System.out.println(car2);
        }
    }
