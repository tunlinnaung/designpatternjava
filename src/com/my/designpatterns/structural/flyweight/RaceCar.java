package com.my.designpatterns.structural.flyweight;

public abstract class RaceCar {
    String name;
    int speed;
    int horsePower;

    public abstract void moveCar(int currentX, int currentY, int newX, int newY);
}
