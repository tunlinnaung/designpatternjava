package com.my.designpatterns.structural.composite;

public class ProductComponentTest {

    public static void main(String[] args) {
        ProductComponent mJeanProduct = new Product("M: Jeans 32", 65.00);
        ProductComponent mTShirtProduct = new Product("M: TShirt 38", 48.00);

        ProductComponent newCatalog = new ProductCatelog("Female Products");
        ProductComponent fJean = new Product("F: Jeans 32", 75.00);
        ProductComponent fTShirt = new Product("F: TShirt 38", 48.00);
        newCatalog.add(fJean);
        newCatalog.add(fTShirt);

        ProductComponent kidCatalog = new ProductCatelog("Kid Products");
        ProductComponent kShorts = new Product("K: Return Gift", 23.00);
        ProductComponent kPlayGears = new Product("K: Summer Play Gears", 48.00);
        kidCatalog.add(kShorts);
        kidCatalog.add(kPlayGears);

        ProductComponent mainProduct = new ProductCatelog("Primary Catalog");
        mainProduct.add(mJeanProduct);
        mainProduct.add(mTShirtProduct);
        mainProduct.add(newCatalog);
        mainProduct.add(kidCatalog);

        mainProduct.print();
    }
}
