package itmo.java.basics.hw.hw8.point2;

public class Cat {
    public String name;

    public int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return age == cat.age && name.equals(cat.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age * 31;
    }

    @Override
    public String toString() {
        return "Cat{name='" + name + "', age=" + age + "}";
    }
}
