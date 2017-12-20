package com.my.designpatterns.structural.facade;

public class OrderFullfillmentController {
    OrderServiceFacade orderServiceFacade;
    boolean isOrderFullfilled = false;

    public void orderProduct(int productId) {
        isOrderFullfilled = orderServiceFacade.placeOrder(productId);
        if (isOrderFullfilled)
            System.out.println("OrderFullfillmentController : order fullfillment completed.");
    }
}
