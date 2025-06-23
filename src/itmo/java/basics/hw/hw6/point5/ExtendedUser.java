package itmo.java.basics.hw.hw6.point5;

public class ExtendedUser extends BaseUser {

    @Override
    public void getInfo() {
        System.out.print("Введите имя: ");
        String name = scanner.next();
        System.out.println("Имя: " + name);
    }
}

