package person.eat;

public class VeggieFoodStartegy implements EatStrategy{
    
    @Override
    public void eat() {
        System.out.println("I just eat veggie food!!");
    }
}
