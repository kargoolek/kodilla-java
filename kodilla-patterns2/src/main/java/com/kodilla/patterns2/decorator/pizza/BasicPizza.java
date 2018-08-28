package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizza implements Ingredient {

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15.00);
    }

    @Override
    public String getIngredients() {
        return "New order for pizza with ingredients: tomato sauce, cheese";
    }

}
