package director.builder;

public class HeardAtackComboBuilder extends FastFoodMealBuilder {

    @Override
    public void buildDrink() {
        meal.setDrink("Milk Shack");
    }

    @Override
    public void buildMain() {
        meal.setMain("Monster Burg");
    }

    @Override
    public void buildSide() {
       meal.setSide("Large Fries");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Fudge Coke");
    }

    @Override
    public void buildGift() {
        meal.setGift("2 king gong");
    }
    
}
