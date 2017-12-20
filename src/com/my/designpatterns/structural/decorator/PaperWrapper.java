package com.my.designpatterns.structural.decorator;

public class PaperWrapper extends FlowerBouquetDecorator {
    FlowerBouquet flowerBouquet;

    public PaperWrapper(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public String getDescription() {
        return flowerBouquet.getDescription() + ", Paper";
    }

    @Override
    public double cost() {
        return flowerBouquet.cost() + 2.0;
    }
}
