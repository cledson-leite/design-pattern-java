package person.eat;

public class MeatFoodStrategy implements EatStrategy{

    @Override
    public void eat() {
        System.out.println("I eat very mush meat!!");
    }
    
}
