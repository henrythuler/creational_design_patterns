package br.com.creational.builder.fluent;

import br.com.creational.builder.fluent.builder.FastFoodMealBuilder;
import br.com.creational.builder.fluent.model.FastFoodMeal;

public class Client {

    public static void main(String[] args) {

        //Ordering a Kid's combo
        FastFoodMeal kids = new FastFoodMealBuilder("Cheeseburger").toSide("Small Fries").toDrink("Small Coke").toDessert("Ice cream").toGift("Spider Man's Toy").thatsAll();
        System.out.println(kids);

        //Ordering a Light Combo
        FastFoodMeal light = new FastFoodMealBuilder("Chicken Burger").toSide("Salad").toDrink("Sparkling Water").toDessert("Apple").thatsAll();
        System.out.println(light);

    }
}