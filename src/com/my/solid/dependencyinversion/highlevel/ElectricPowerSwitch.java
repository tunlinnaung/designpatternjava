package com.my.solid.dependencyinversion.highlevel;

public class ElectricPowerSwitch implements Switch {
    Switchable switchable;
    boolean isOn;

    public ElectricPowerSwitch(Switchable switchable) {
        this.switchable = switchable;
        this.isOn = false;
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void press() {
        boolean isPressed = this.isOn;
        if (isPressed) {
            switchable.turnOn();
            this.isOn = false;
        }
        else {
            switchable.turnOff();
            this.isOn = true;
        }
    }
}
