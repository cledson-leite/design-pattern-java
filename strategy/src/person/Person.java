package person;

import person.eat.EatStrategy;
import person.transport.TransportStrategy;
import person.work.WorkStrategy;

public class Person {
    private String name;
    private EatStrategy eatStrategy;
    private TransportStrategy transportStrategy;
    private WorkStrategy workStrategy;
    
    public Person(String name, EatStrategy eatStrategy, TransportStrategy transportStrategy,
            WorkStrategy workStrategy) {
        this.name = name;
        this.eatStrategy = eatStrategy;
        this.transportStrategy = transportStrategy;
        this.workStrategy = workStrategy;
    }

    public void eat() {
        eatStrategy.eat();
    }

    public void transport() {
        transportStrategy.move();
    }

    public void work() {
        workStrategy.work();
    }
    
    public void presentationYourself() {
        System.out.println("Hi, I'm " + name);
        work();
        eat();
        transport();
    }
}


