package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class IngPepperoniDecorator extends AbstractPizzaDecorator {

    public IngPepperoniDecorator(Ingredient ingredient) {
        super(ingredient);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getIngredients(){
        return super.getIngredients()+", pepperoni";
    }
}
