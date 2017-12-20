package com.my.designpatterns.structural.decorator;

public class Glitter extends FlowerBouquetDecorator {
    FlowerBouquet flowerBouquet;

    public Glitter(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public String getDescription() {
        return flowerBouquet.getDescription() + ", Glitter";
    }

    @Override
    public double cost() {
        return flowerBouquet.cost() + 4.0;
    }
}
