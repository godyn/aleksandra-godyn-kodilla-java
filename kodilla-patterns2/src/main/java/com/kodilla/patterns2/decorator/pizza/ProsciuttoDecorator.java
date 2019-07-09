package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ProsciuttoDecorator extends AbstractPizzaOrderDecorator{

    public ProsciuttoDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getTotalPrice(){
        return super.getTotalPrice().add(new BigDecimal(7));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " + prosciutto";
    }
}
