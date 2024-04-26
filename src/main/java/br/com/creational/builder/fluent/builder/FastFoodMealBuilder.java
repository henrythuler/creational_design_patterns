package br.com.creational.builder.fluent.builder;

import br.com.creational.builder.fluent.model.FastFoodMeal;

public class FastFoodMealBuilder {
    //Mandatory Attribute
    private String main;

    //Optional Attibutes
    private String side;
    private String drink;
    private String dessert;
    private String gift;

    public FastFoodMealBuilder(String main) {
        this.main = main;
    }

    public FastFoodMealBuilder toSide(String side) {
        this.side = side;
        return this;
    }

    public FastFoodMealBuilder toDrink(String drink) {
        this.drink = drink;
        return this;
    }

    public FastFoodMealBuilder toDessert(String dessert) {
        this.dessert = dessert;
        return this;
    }

    public FastFoodMealBuilder toGift(String gift) {
        this.gift = gift;
        return this;
    }

    public FastFoodMeal thatsAll() {
        return new FastFoodMeal(main, side, drink, dessert, gift);
    }
}
