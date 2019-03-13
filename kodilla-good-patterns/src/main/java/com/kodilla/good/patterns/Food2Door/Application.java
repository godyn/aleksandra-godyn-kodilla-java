package com.kodilla.good.patterns.Food2Door;

public class Application {

    public static void main (String[] args){
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrive();

        Food2DoorProcessor food2DoorProcessor = new Food2DoorProcessor(new HealthyShop(), new MailService());
        food2DoorProcessor.placeAnOrder(orderRequest);

    }
}
