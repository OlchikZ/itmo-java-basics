package itmo.java.basics.lessons.lesson11.strategy;

public class Developer {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity() {
        this.activity.work();
    }
}
