package person.transport;

public class AirplaneStrategy implements TransportStrategy{
    @Override
    public void move() {
        System.out.println("I'm flying to work!!");
    }
}
