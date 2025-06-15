package itmo.java.basics.lessons.lesson2;

public enum Color {
    DEEP_BLUE("Синий", 23),
    RED("Красный", 55),
    GREEN("Зеленый", 88),
    WHITE("Белый", 11);

    private final String description;
    private final int code;

    Color(String description, int code) {
        this.description = description;
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public int getCode() {
        return code;
    }
}