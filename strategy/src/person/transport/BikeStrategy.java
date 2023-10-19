package person.transport;

public class BikeStrategy implements TransportStrategy{
    @Override
    public void move() {
        System.out.println("I cycle a lot to get there!!");
    }
}
