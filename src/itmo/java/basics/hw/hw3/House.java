package itmo.java.basics.hw.hw3;

class House {
    private String name;
    private int floor;
    private Integer year;

    static final Integer STATIC_CONSTANT = 2025;

    public int getAge() {
        return STATIC_CONSTANT - year;
    }

    public House() {
    }

    public void setAllValues(String name, int floor, int year) {
        this.name = name;
        this.floor = floor;
        this.year = year;
    }

    public void printInfo() {
        System.out.println("Наименование: " + name);
        System.out.println("Этажей: " + floor);
        System.out.println("Год постройки: " + year);
        System.out.println("Лет с постройки: " + getAge());
    }


}

class Point3Program {
    public static void main(String[] args) {
        House house1 = new House();
        house1.setAllValues("New", 12, 2024);

        House house2 = new House();
        house2.setAllValues("NotNew", 3, 1986);

        house1.printInfo();
        System.out.println();
        house2.printInfo();
    }
}

