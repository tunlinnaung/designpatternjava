package com.my.designpatterns.structural.decorator;

public class RoseBouquest extends FlowerBouquet {

    public RoseBouquest() {
        description = "Rose Bouquest";
    }

    @Override
    public double cost() {
        return 30;
    }
}
