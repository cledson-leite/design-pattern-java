package model;

public class Express implements Drink {

    @Override
    public void serve() {
        System.out.println("- Adding 50ml of express");
    }

    @Override
    public Double getPrice() {
        return 1.5;
    }
    
}
