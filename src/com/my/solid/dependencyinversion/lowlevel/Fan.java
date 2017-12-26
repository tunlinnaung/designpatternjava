package com.my.solid.dependencyinversion.lowlevel;

import com.my.solid.dependencyinversion.highlevel.Switchable;

public class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan : turnOn.");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan : turnOff.");
    }
}
