package com.my.designpatterns.structural.flyweight;

public class RaceCarClient {
    RaceCar raceCar;

    public RaceCarClient(String name) {
        this.raceCar = RaceCarFactory.getRaceCar(name);
    }

    int currentX = 0;
    int currentY = 0;
    public void moveCar(int newX, int newY) {
        raceCar.moveCar(currentX, currentY, newX, newY);

        currentX = newX;
        currentY = newY;
    }
}
