package com.my.designpatterns.structural.composite;

public abstract class ProductComponent {
    public void add(ProductComponent component) {
        throw new UnsupportedOperationException("Unsupported Add operation");
    }

    public void remove(ProductComponent component) {
        throw new UnsupportedOperationException("Unsupported remove operation");
    }

    public String getName() {
        throw new UnsupportedOperationException("Unsupported name operation");
    }

    public double getPrice() {
        throw new UnsupportedOperationException("Unsupported price operation");
    }

    public void print() {
        throw new UnsupportedOperationException("Unsupported print operation");
    }
}
