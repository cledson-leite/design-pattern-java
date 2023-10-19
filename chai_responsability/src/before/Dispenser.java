package before;

public class Dispenser {
    public void withdraw(Integer amount) {
        Integer remaining = amount;
        System.out.println("Calculating bills set for $" + remaining);
        if (remaining >= 50) {
            int bills = remaining / 50;
            remaining %= 50;
            System.out.println(String.format("- %d bills of $%d, $%d remaing", bills, 50, remaining));
        }
        if (remaining >= 10) {
            int bills = remaining / 10;
            remaining %= 10;
            System.out.println(String.format("- %d bills of $%d, $%d remaing", bills, 10, remaining));
        }
        if (remaining >= 1) {
            int bills = remaining / 1;
            remaining %= 1;
            System.out.println(String.format("- %d bills of $%d, $%d remaing", bills, 1, remaining));
        }
    }
}
