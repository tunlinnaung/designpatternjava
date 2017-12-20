package com.my.designpatterns.structural.facade;

public class OrderControllerTest {
    public static void main(String[] args) {
        OrderFullfillmentController controller = new OrderFullfillmentController();
        controller.orderServiceFacade = new OrderServiceImpl();
        controller.orderProduct(9);
        boolean result = controller.isOrderFullfilled;
        assert result;
    }
}
