package decorator;

import model.Drink;

public class DoubleDecorator extends DrinkDecorator {

    public DoubleDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public void serve() {
        drink.serve();
        drink.serve();
    }

    @Override
    public Double getPrice() {
        return drink.getPrice() + 1.75;
    }
    
}
