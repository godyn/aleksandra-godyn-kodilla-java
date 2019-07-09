package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaOrderWithTunaGetTotalPrice(){
        //GIVEN
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new TunaDecorator(pizzaOrder);
        //WHEN
        BigDecimal calculatedPrice = pizzaOrder.getTotalPrice();
        //THEN
        Assert.assertEquals(new BigDecimal(19), calculatedPrice);
    }

    @Test
    public void testPizzaOrderWithTunaGetDescription(){
        //GIVEN
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new TunaDecorator(pizzaOrder);
        //WHEN
        String description = pizzaOrder.getDescription();
        //THEN
        Assert.assertEquals("Ingredients: bottom cake, tomato sauce, cheese + tuna", description);
    }

    @Test
    public void testPizzaOrderWithProsciuttoAndDoubleCheeseGetTotalPrice(){
        //GIVEN
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new DoubleCheeseDecorator(pizzaOrder);
        pizzaOrder = new ProsciuttoDecorator(pizzaOrder);
        //WHEN
        BigDecimal calculatedPrice = pizzaOrder.getTotalPrice();
        //THEN
        Assert.assertEquals(new BigDecimal(27), calculatedPrice);
    }

    @Test
    public void testPizzaOrderWithProsciuttoAndDoubleCheeseGetDescription(){
        //GIVEN
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new DoubleCheeseDecorator(pizzaOrder);
        pizzaOrder = new ProsciuttoDecorator(pizzaOrder);
        //WHEN
        String description = pizzaOrder.getDescription();
        //THEN
        Assert.assertEquals("Ingredients: bottom cake, tomato sauce, cheese + extra cheese + prosciutto", description);
    }
}
