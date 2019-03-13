package com.kodilla.good.patterns.Food2Door;

public class Food2DoorProcessor {

    private Supplier supplier;
    private InformationService informationService;

    public Food2DoorProcessor(final Supplier supplier, final InformationService informationService) {
        this.supplier = supplier;
        this.informationService = informationService;
    }

    public void placeAnOrder(OrderRequest orderRequest){
        supplier.process(orderRequest);
        informationService.inform();
    }
}
