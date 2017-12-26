package com.my.solid.dependencyinversion.highlevel;

import com.my.solid.dependencyinversion.lowlevel.Fan;
import com.my.solid.dependencyinversion.lowlevel.LightBulb;

public class ElectricPowerSwitchTest {

    public static void main(String[] args) {
        Switchable lightBulb = new LightBulb();
        Switch lightBulbSwitch = new ElectricPowerSwitch(lightBulb);
        lightBulbSwitch.press();
        lightBulbSwitch.press();

        Switchable fan = new Fan();
        Switch fanSwitch = new ElectricPowerSwitch(fan);
        fanSwitch.press();
        fanSwitch.press();
    }

}
