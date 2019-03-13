package com.kodilla.good.patterns.Food2Door;

public class HealthyShop implements Supplier {

    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("Welcome in HealthyShop. We are working on your order.");
    }
}
