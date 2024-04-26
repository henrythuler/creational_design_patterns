package br.com.creational.builder.builder.builder;

public class LightMealBuilder extends FastFoodMealBuilder {
    @Override
    public void buildDrink() {
        meal.setDrink("Sparkling Water");
    }

    @Override
    public void buildMain() {
        meal.setMain("Chicken Burger");
    }

    @Override
    public void buildSide() {
        meal.setSide("Small Fries");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Apple");
    }

    @Override
    public void buildGift() {
        meal.setToy("Fit Stamp");
    }
}
