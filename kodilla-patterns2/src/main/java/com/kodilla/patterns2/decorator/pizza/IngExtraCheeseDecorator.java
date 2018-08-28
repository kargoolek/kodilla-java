package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class IngExtraCheeseDecorator extends AbstractPizzaDecorator {

    public IngExtraCheeseDecorator(Ingredient ingredient) {
        super(ingredient);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getIngredients(){
        return super.getIngredients()+" with extra cheese";
    }

}