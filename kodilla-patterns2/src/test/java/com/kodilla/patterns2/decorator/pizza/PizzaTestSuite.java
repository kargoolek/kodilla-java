package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaTestSuite {

  @Test
  public void testBasicPizzaGetCost() {
    //Given
    Ingredient pizza = new BasicPizza();
    //When
    BigDecimal calculatedCost = pizza.getCost();
    //Then
    assertEquals(new BigDecimal(15), calculatedCost);
  }

  @Test
  public void testBasicPizzaGetDescription() {
    //Given
    Ingredient pizza = new BasicPizza();
    //When
    String description = pizza.getIngredients();
    //Then
    assertEquals("New order for pizza with ingredients: tomato sauce, cheese", description);
  }

  @Test
  public void testPizzaWithMoreIngredients() {
    //Given
    Ingredient pizza = new BasicPizza();
    pizza = new IngOnionDecorator(pizza);

    Ingredient pizzaAll = new BasicPizza();
    pizzaAll = new IngOnionDecorator(pizzaAll);
    pizzaAll = new IngChickenDecorator(pizzaAll);
    pizzaAll = new IngSausageDecorator(pizzaAll);
    pizzaAll = new IngPepperoniDecorator(pizzaAll);
    pizzaAll = new IngExtraCheeseDecorator(pizzaAll);

    //When
    BigDecimal calculatedCostOfPizzaWithOnion = pizza.getCost();
    BigDecimal calculatedCostOfPizzaWithAllIngredients = pizzaAll.getCost();

    //Then
    assertEquals(new BigDecimal(17), calculatedCostOfPizzaWithOnion);
    assertEquals(new BigDecimal(27), calculatedCostOfPizzaWithAllIngredients);
    assertEquals("New order for pizza with ingredients: tomato sauce, cheese, onion", pizza.getIngredients());
    assertEquals("New order for pizza with ingredients: tomato sauce, cheese, onion, chicken, sausage, pepperoni with extra cheese", pizzaAll.getIngredients());

    //log
    System.out.println(pizza.getIngredients()+". Total cost: "+ pizza.getCost());
    System.out.println(pizzaAll.getIngredients()+". Total cost: "+ pizzaAll.getCost());
  }

}