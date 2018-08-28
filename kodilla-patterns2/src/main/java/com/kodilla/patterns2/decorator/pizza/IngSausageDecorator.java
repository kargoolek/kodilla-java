package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class IngSausageDecorator extends AbstractPizzaDecorator {

    public IngSausageDecorator(Ingredient ingredient) {
        super(ingredient);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getIngredients(){
        return super.getIngredients()+", sausage";
    }
}
