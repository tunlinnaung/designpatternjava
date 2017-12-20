package com.my.designpatterns.structural.decorator;

public class OrchidBouquet extends FlowerBouquet {

    public OrchidBouquet() {
        description = "Orchid Bouquest";
    }

    @Override
    public double cost() {
        return 0;
    }
}
