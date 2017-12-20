package com.my.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class RaceCarFactory {
    static Map<String, RaceCar> raceCarMap = new HashMap<>();

    public static RaceCar getRaceCar(String name) {
        if (raceCarMap.containsKey(name)) {
            return raceCarMap.get(name);
        }
        RaceCar raceCar;
        switch (name) {
            case "Midget":
                raceCar = new FlyWeightMidgetCar();
                raceCar.name = name;
                raceCar.speed = 30;
                raceCar.horsePower = 1300;
                raceCarMap.put(name, raceCar);
                break;
            case "Sprint":
                raceCar = new FlyWeightSprintCar();
                raceCar.name = name;
                raceCar.speed = 50;
                raceCar.horsePower = 1500;
                raceCarMap.put(name, raceCar);
                break;
            default:
                throw new IllegalArgumentException("Unsupported car type");
        }
        return raceCar;
    }
}
