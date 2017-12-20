package com.my.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ProductCatelog extends ProductComponent {

    List<ProductComponent> productComponents = new ArrayList<>();
    private String name;

    public ProductCatelog(String name) {
        this.name = name;
    }

    @Override
    public void add(ProductComponent component) {
        productComponents.add(component);
    }

    @Override
    public void remove(ProductComponent component) {
        productComponents.remove(component);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        productComponents.forEach(ProductComponent::print);
    }
}
