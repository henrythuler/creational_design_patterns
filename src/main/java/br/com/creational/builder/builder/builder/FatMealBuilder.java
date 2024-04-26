package br.com.creational.builder.builder.builder;

public class FatMealBuilder extends FastFoodMealBuilder {
    @Override
    public void buildDrink() {
        meal.setDrink("Big Coke");
    }

    @Override
    public void buildMain() {
        meal.setMain("Triple Cheddar Bacon");
    }

    @Override
    public void buildSide() {
        meal.setSide("Extra Large Fries");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Big Milkshake");
    }

    @Override
    public void buildGift() {
        meal.setToy("Fat Crown");
    }
}
