package com.my.designpatterns.structural.decorator;

public class RipponBow extends FlowerBouquetDecorator {
    FlowerBouquet flowerBouquet;

    public RipponBow(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public String getDescription() {
        return flowerBouquet.getDescription() + ", Rippon";
    }

    @Override
    public double cost() {
        return flowerBouquet.cost() + 6.0;
    }
}
