package decorator;

import model.Drink;

public class MilkDecorator extends DrinkDecorator {

    public MilkDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public void serve() {
        drink.serve();
        System.out.println("- Adding 30ml of milk");
    }

    @Override
    public Double getPrice() {
        return drink.getPrice() + 0.5;
    }
    
}
