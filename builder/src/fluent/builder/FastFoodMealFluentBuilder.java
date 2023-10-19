package fluent.builder;

import fluent.model.FastFoodFluentMeal;

public class FastFoodMealFluentBuilder {
    private FastFoodFluentMeal meal = new FastFoodFluentMeal();

    public FastFoodMealFluentBuilder drink(String value) {
        meal.setDrink(value);
        return this;
    }

    public FastFoodMealFluentBuilder main(String value) {
        meal.setMain(value);
        return this;
    }

    public FastFoodMealFluentBuilder side(String value) {
        meal.setSide(value);
        return this;
    }

    public FastFoodMealFluentBuilder dessert(String value) {
        meal.setDessert(value);
        return this;
    }

    public FastFoodMealFluentBuilder gift(String value) {
        meal.setGift(value);
        return this;
    }

    public FastFoodFluentMeal build() {
        return meal;
    }
}