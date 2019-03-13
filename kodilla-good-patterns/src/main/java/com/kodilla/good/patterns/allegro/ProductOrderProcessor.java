package com.kodilla.good.patterns.allegro;

public class ProductOrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private StockManager stockManager;

    public ProductOrderProcessor(final InformationService informationService, final OrderService orderService, final StockManager stockManager) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.stockManager = stockManager;
    }

    public OrderDto process(OrderRequest orderRequest){
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProductId(), orderRequest.getQuantity());
        if(isOrdered){
            informationService.inform(orderRequest.getUser());
            stockManager.decreaseStock(orderRequest.getProductId(), orderRequest.getQuantity());
            return new OrderDto(orderRequest.getUser(), true);
        }
        else{
            return new OrderDto(orderRequest.getUser(), false);
        }

    }
}
