package com.kodilla.good.patterns.allegro;

public class Application {

    public static void main(String[] args){

        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retrive();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new SmsInformationService(), new BookOrderService(), new BookStockManager());
        productOrderProcessor.process(orderRequest);

    }
}
