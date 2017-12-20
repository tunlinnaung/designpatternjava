package com.my.designpatterns.structural.flyweight;

public class RaceCarClientTest {
    public static void main(String[] args) {
        RaceCarClient[] midgetRaceCar = {
                new RaceCarClient("Midget"),
                new RaceCarClient("Midget"),
                new RaceCarClient("Midget"),
                new RaceCarClient("Sprint"),
                new RaceCarClient("Sprint"),
                new RaceCarClient("Sprint")
        };
        midgetRaceCar[0].moveCar(20, 1000);
        midgetRaceCar[1].moveCar(30, 2000);
        midgetRaceCar[2].moveCar(40, 3000);
        midgetRaceCar[3].moveCar(50, 4000);
        midgetRaceCar[4].moveCar(60, 5000);
        midgetRaceCar[5].moveCar(70, 6000);

        System.out.println("Count of midget car : " + FlyWeightMidgetCar.num);
        System.out.println("Count of sprint car : " + FlyWeightSprintCar.num);
    }
}
