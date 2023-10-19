package person.transport;

public class CarStrategy implements TransportStrategy{
    @Override
    public void move() {
        System.out.println("I'm normal!!");
    }
}
