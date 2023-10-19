package director.builder;

public class BurgerComboBuilder extends FastFoodMealBuilder {

    @Override
    public void buildDrink() {
       meal.setDrink("Coke");
    }

    @Override
    public void buildMain() {
       meal.setMain("ChessBurg");
    }

    @Override
    public void buildSide() {
       meal.setSide("Fries");
    }

    @Override
    public void buildDessert() {
       
    }

    @Override
    public void buildGift() {
        
    }
    
}
