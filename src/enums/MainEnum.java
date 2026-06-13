package enums;

public class MainEnum {

    public static void main(String[] args) {
        Subscription subscription = new Subscription();

        subscription.state = Subscription.SUBSCRIPTION_STATE_SUSPENDED;
    }
}

class Subscription {

    public static final int SUBSCRIPTION_STATE_NONE = 0;
    public static final int SUBSCRIPTION_STATE_ACTIVE = 1;
    public static final int SUBSCRIPTION_STATE_SUSPENDED = 2;

    String name;
    String description;
    int state;

}
