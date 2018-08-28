package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class IngOnionDecorator extends AbstractPizzaDecorator {

    public IngOnionDecorator(Ingredient ingredient) {
        super(ingredient);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getIngredients(){
        return super.getIngredients()+", onion";
    }
}
