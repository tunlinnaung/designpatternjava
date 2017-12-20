package com.my.designpatterns.structural.facade;

public class OrderServiceImpl implements OrderServiceFacade {
    @Override
    public boolean placeOrder(int productId) {
        boolean isFullfilled = false;

        Product product = new Product();
        product.setProductId(productId);

        if (InventoryService.isAvailable(product)) {
            System.out.println("Product with ID (" + productId + ") is available.");

            if (PaymentService.makePayment()) {
                System.out.println("Product's payment have done.");

                ShippingService.shipProduct(product);
                System.out.println("Product have been shipped.");

                isFullfilled = true;
            }
        }
        return isFullfilled;
    }
}
