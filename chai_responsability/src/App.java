import after.DispenserAfter;
import before.Dispenser;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("### Withdraw without pattern ###");
        Dispenser dispenser = new Dispenser();
        dispenser.withdraw(230);
        System.out.println("---------------------------");
        dispenser.withdraw(45);
        
        System.out.println("");
        System.out.println("### Withdraw with pattern ###");
        DispenserAfter dispenserAfter = new DispenserAfter();
        dispenserAfter.withdraw(230);
        System.out.println("---------------------------");
        dispenserAfter.withdraw(45);
    }
}
