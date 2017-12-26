package com.my.solid.dependencyinversion.lowlevel;

import com.my.solid.dependencyinversion.highlevel.Switchable;

public class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb : turnOn.");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb : turnOff.");
    }
}
