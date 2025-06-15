package itmo.java.basics.lessons.lesson2;

public class Car {
    private String brand;
    private String model;
    private Integer seatPlace;
    private Double engineCapacity;
    private Boolean isNew;
    private int doorsCount;
    private Long price;
    private Color color;

    public Car() {
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand, Boolean isNew) {
        this.brand = brand;
        this.isNew = isNew;
    }

    public Car(String brand, String model, Integer seatPlace, Double engineCapacity, Boolean isNew, int doorsCount, Long price, Color color) {
        this.brand = brand;
        this.model = model;
        this.seatPlace = seatPlace;
        this.engineCapacity = engineCapacity;
        this.isNew = isNew;
        this.doorsCount = doorsCount;
        this.price = price;
        this.color = color;
    }

    public Car(Color color, String brand, String model, Integer seatPlace, Double engineCapacity, Boolean isNew, int doorsCount, Long price) {
        this.brand = brand;
        this.model = model;
        this.seatPlace = seatPlace;
        this.engineCapacity = engineCapacity;
        this.isNew = isNew;
        this.doorsCount = doorsCount;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getSeatPlace() {
        return seatPlace;
    }

    public void setSeatPlace(Integer seatPlace) {
        this.seatPlace = seatPlace;
    }

    public Double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public int getDoorsCount() {
        return doorsCount;
    }

    public void setDoorsCount(int doorsCount) {
        this.doorsCount = doorsCount;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", seatPlace=" + seatPlace +
                ", engineCapacity=" + engineCapacity +
                ", isNew=" + isNew +
                ", doorsCount=" + doorsCount +
                ", price=" + price +
                ", color=" + color +
                '}';
    }
}
