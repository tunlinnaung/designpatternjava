package com.my.designpatterns.structural.flyweight;

public class FlyWeightMidgetCar extends RaceCar {
    public static int num;

    public FlyWeightMidgetCar() {
        num++;
    }

    @Override
    public void moveCar(int currentX, int currentY, int newX, int newY) {
        System.out.println("New location of " + this.name + " car is X" + newX + " - Y" + newY);
    }
}
