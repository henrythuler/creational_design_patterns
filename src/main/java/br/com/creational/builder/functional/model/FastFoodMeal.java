package br.com.creational.builder.functional.model;

public class FastFoodMeal {

    private final String main;
    private final String side;
    private final String drink;
    private final String dessert;
    private final String gift;

    public FastFoodMeal(String main, String side, String drink, String dessert, String gift) {
        this.main = main;
        this.side = side;
        this.drink = drink;
        this.dessert = dessert;
        this.gift = gift;
    }

    public String getDrink() {
        return drink;
    }

    public String getMain() {
        return main;
    }

    public String getSide() {
        return side;
    }

    public String getDessert() {
        return dessert;
    }

    public String getToy() {
        return gift;
    }

    @Override
    public String toString() {
        return "Combo [drink=" + drink + ", main=" + main + ", side="
                + side + ", dessert=" + dessert + ", gift=" + gift + "]";
    }

    public static class Builder {

        //Mandatory
        private String main;

        //Optionals
        private String side;
        private String drink;
        private String dessert;
        private String gift;

        public Builder(String main) {
            this.main = main;
        }

        public Builder toSide(String side) {
            this.side = side;
            return this;
        }

        public Builder toDrink(String drink) {
            this.drink = drink;
            return this;
        }

        public Builder toDessert(String dessert) {
            this.dessert = dessert;
            return this;
        }

        public Builder toGift(String gift) {
            this.gift = gift;
            return this;
        }

        public FastFoodMeal thatsAll() {
            return new FastFoodMeal(main, side, drink, dessert, gift);
        }

    }

}
