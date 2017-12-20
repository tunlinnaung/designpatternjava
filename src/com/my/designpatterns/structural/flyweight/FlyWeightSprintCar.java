package com.my.designpatterns.structural.flyweight;

public class FlyWeightSprintCar extends RaceCar {
    public static int num;

    public FlyWeightSprintCar() {
        num++;
    }

    @Override
    public void moveCar(int currentX, int currentY, int newX, int newY) {
        System.out.println("New location of " + this.name + " car is X" + newX + " - Y" + newY);
    }
}
