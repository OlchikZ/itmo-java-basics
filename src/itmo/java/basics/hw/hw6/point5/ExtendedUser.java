package itmo.java.basics.hw.hw6.point5;

public class ExtendedUser extends BaseUser {

    @Override
    public String getName() {
        System.out.print("Пожалуйста, введите ваше имя пользователя: ");
        return scanner.next(); // используем scanner, унаследованный из BaseUser
    }
}

