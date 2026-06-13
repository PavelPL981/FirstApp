package enums;

public class MainEnum {

    public static void main(String[] args) {
        Subscription subscription = new Subscription();
        subscription.state = Subscription.State.SUSPENDED;

        System.out.println(Subscription.State.valueOf("ACTIVE"));
        System.out.println(Subscription.State.NONE.toString());
        System.out.println(Subscription.State.SUSPENDED.ordinal());
        System.out.println(Subscription.State.values()[2]);

        switch (subscription.state) {
            case NONE:
                break;
            case ACTIVE:
                break;
            case SUSPENDED:
                break;
        }
    }
}

class Subscription {

    public static final int SUBSCRIPTION_STATE_NONE = 0;
    public static final int SUBSCRIPTION_STATE_ACTIVE = 1;
    public static final int SUBSCRIPTION_STATE_SUSPENDED = 2;

    String name;
    String description;
    State state;

    enum State {
        NONE, ACTIVE, SUSPENDED;
    }

}
