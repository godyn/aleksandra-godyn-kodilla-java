package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class DoubleCheeseDecorator extends AbstractPizzaOrderDecorator {

    public DoubleCheeseDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getTotalPrice(){
        return super.getTotalPrice().add(new BigDecimal(5));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " + extra cheese";
    }
}
