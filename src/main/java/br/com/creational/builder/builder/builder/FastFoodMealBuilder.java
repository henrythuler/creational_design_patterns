package br.com.creational.builder.builder.builder;

import br.com.creational.builder.builder.model.FastFoodMeal;

public abstract class FastFoodMealBuilder {
    protected FastFoodMeal meal;

    public FastFoodMealBuilder() {
        meal = new FastFoodMeal();
    }

    public FastFoodMeal getMeal() {
        return this.meal;
    }

    public void buildDrink() {
    }

    ;

    public void buildMain() {
    }

    ;

    public void buildSide() {
    }

    ;

    public void buildDessert() {
    }

    ;

    public void buildGift() {
    }

    ;
}
