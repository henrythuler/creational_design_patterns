package br.com.creational.builder.builder.director;

import br.com.creational.builder.builder.builder.FastFoodMealBuilder;
import br.com.creational.builder.builder.model.FastFoodMeal;

public class MealDirector {

    private FastFoodMealBuilder builder;

    public MealDirector(FastFoodMealBuilder builder) {
        this.builder = builder;
    }

    public void constructCombo() {
        builder.buildDrink();
        builder.buildMain();
        builder.buildSide();
        builder.buildDessert();
        builder.buildGift();
    }

    public FastFoodMeal getCombo() {
        constructCombo();
        return this.builder.getMeal();
    }

}
