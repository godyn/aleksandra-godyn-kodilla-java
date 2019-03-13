package com.kodilla.good.patterns.Food2Door;

public class GlutenFreeShop implements Supplier {

    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("Gluten Free Shop processing your order. Please wait for confirmation.");
    }
}
