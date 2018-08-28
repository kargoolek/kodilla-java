package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public abstract class AbstractPizzaDecorator implements Ingredient {
    private final Ingredient ingredient;

    protected AbstractPizzaDecorator(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    @Override
    public BigDecimal getCost() {
        return ingredient.getCost();
    }

    @Override
    public String getIngredients() {
        return ingredient.getIngredients();
    }

}
