package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class TunaDecorator extends AbstractPizzaOrderDecorator {

    public TunaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getTotalPrice(){
        return super.getTotalPrice().add(new BigDecimal(4));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " + tuna";
    }

}
