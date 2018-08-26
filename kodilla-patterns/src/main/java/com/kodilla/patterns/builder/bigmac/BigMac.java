package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BigMac {
    private final String bun, sauce;
    private final int burgers;
    private final List<String> ingredients;

    private BigMac(final String bun, final String sauce, final int burgers, final List<String> ingredients) {
        this.bun = bun;
        this.sauce = sauce;
        this.burgers = burgers;
        this.ingredients = ingredients;
    }

    public static class BigmacBuilder {
        private String bun, sauce;
        private int burgers;
        private List<String> ingredients = new ArrayList<>();
        private List<String> availableIngredients = Arrays.asList("sałata", "cebula", "bekon", "ogórek", "papryczki chilli", "pieczarki", "krewetki", "ser");
        private List<String> availablesauce = Arrays.asList("standard", "1000 wysp", "barbecue");

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            if(!availablesauce.contains(sauce)) throw new IllegalStateException("Sorry, sauce '" + sauce + "' is not available now." );
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder burgers(int quantity) {
            if(quantity > 3) throw new IllegalStateException("You can choose up to 3 burgers.");
            this.burgers = quantity;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            if(!availableIngredients.contains(ingredient)) throw new IllegalStateException("Sorry, ingredient '" + ingredient + "' is not available now." );
            ingredients.add(ingredient);
            return this;
        }

        public BigMac build() {
            return new BigMac(bun, sauce, burgers, ingredients);
        }

    }

    public String getBun() {
        return bun;
    }

    public String getSauce() {
        return sauce;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", sauce='" + sauce + '\'' +
                ", burgers=" + burgers +
                ", ingredients=" + ingredients +
                '}';
    }
}
