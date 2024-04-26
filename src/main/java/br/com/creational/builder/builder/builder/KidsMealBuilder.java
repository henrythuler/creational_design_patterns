package br.com.creational.builder.builder.builder;

public class KidsMealBuilder extends FastFoodMealBuilder {
    @Override
    public void buildDrink() {
        meal.setDrink("Small Coke");
    }

    @Override
    public void buildMain() {
        meal.setMain("Cheeseburger");
    }

    @Override
    public void buildSide() {
        meal.setSide("Small fries");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Ice cream");
    }

    @Override
    public void buildGift() {
        meal.setToy("Spider man's toy");
    }
}
