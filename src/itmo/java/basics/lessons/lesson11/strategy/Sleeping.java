package itmo.java.basics.lessons.lesson11.strategy;

public class Sleeping implements Activity{
    @Override
    public void work() {
        System.out.println("Sleeping...");
    }
}