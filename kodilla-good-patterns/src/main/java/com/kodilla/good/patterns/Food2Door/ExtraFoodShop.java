package com.kodilla.good.patterns.Food2Door;

public class ExtraFoodShop implements Supplier {

    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("Order in ExtraFoodShop - under preparing.");
    }
}
