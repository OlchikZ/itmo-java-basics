package itmo.java.basics.hw.hw6.points12;

public class Client extends Human implements BankRelated {
    private String bankName;

    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public void printInfo() {
        System.out.println("Клиент: " + getName() + " " + getSurname() + ", Банк: " + bankName);
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
