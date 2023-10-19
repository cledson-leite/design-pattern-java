import before.model.FastFoodMeal;
import director.MealDirector;
import director.builder.BurgerComboBuilder;
import director.builder.FastFoodMealBuilder;
import director.builder.HeardAtackComboBuilder;
import director.builder.JustFriesBuilder;
import fluent.builder.FastFoodMealFluentBuilder;
import fluent.model.FastFoodFluentMeal;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("### Combos without pattern");
        FastFoodMeal burgerCombo = new FastFoodMeal("Coke", "CheesBurg", "Fries");
        System.out.println(burgerCombo);
        FastFoodMeal justFries = new FastFoodMeal(null, null, "Fries");
        System.out.println(justFries);
        FastFoodMeal heardAtackCombo = new FastFoodMeal("Milk Shack", "Monster Burg", "Large Fries", "Fudge Cake","2 king gong");
        System.out.println(heardAtackCombo);
        
        System.out.println("### Combos with director pattern");
        FastFoodMealBuilder burgerBuilder = new BurgerComboBuilder();
        MealDirector director = new MealDirector(burgerBuilder);
        director.constructCombo();
        System.out.println(director.getCombo());
        FastFoodMealBuilder justFriesBuilder = new JustFriesBuilder();
        director = new MealDirector(justFriesBuilder);
        director.constructCombo();
        System.out.println(director.getCombo());
        FastFoodMealBuilder heardAtackComboBuilder = new HeardAtackComboBuilder();
        director = new MealDirector(heardAtackComboBuilder);
        director.constructCombo();
        System.out.println(director.getCombo());
        
        System.out.println("### Combos with fluent pattern");
        FastFoodMealFluentBuilder builder = new FastFoodMealFluentBuilder();
        FastFoodFluentMeal burgerFluentCombo = builder.drink("Coke").main("Monster Burg").side("Large Fries").dessert("Fudge Coke").gift("2 king gong").build();
        System.out.println(burgerFluentCombo);
        FastFoodFluentMeal justFriesFluent = builder.side("Fries").build();
        System.out.println(justFriesFluent);
        FastFoodFluentMeal heardAtack = builder.drink("Milk Shack").main("Chess Burg").side("Fries").build();
        System.out.println(heardAtack);
        
    }
}
