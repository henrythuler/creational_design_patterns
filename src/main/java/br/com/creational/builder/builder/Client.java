package br.com.creational.builder.builder;

import br.com.creational.builder.builder.builder.FastFoodMealBuilder;
import br.com.creational.builder.builder.builder.KidsMealBuilder;
import br.com.creational.builder.builder.builder.LightMealBuilder;
import br.com.creational.builder.builder.director.MealDirector;

public class Client {

    public static void main(String[] args) {

        //Ordering a Kid's combo
        FastFoodMealBuilder kids = new KidsMealBuilder();
        MealDirector meal = new MealDirector(kids);

        System.out.println(meal.getCombo());

        //Ordering a Light Combo
        FastFoodMealBuilder light = new LightMealBuilder();
        meal = new MealDirector(light);

        System.out.println(meal.getCombo());

    }
}