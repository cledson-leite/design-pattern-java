package person.work;

public class PilotStrategy implements WorkStrategy{
    
    @Override
    public void work() {
        System.out.println("I travel a lot !!!");
    }
}
