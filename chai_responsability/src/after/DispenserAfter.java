package after;

public class DispenserAfter {
    private Bill chain;

    public DispenserAfter() {
        chain = new Bill(50, new Bill(10, new Bill(1)));
    }

    public void withdraw(Integer value) {
        chain.execute(value);
    }
}
