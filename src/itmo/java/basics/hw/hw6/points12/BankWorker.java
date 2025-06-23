package itmo.java.basics.hw.hw6.points12;

public class BankWorker extends Human implements BankRelated {
    private String bankName;

    public BankWorker(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public void printInfo() {
        System.out.println("Работник банка: " + getName() + " " + getSurname() + ", Банк: " + bankName);
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}