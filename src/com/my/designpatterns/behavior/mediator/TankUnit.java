package com.my.designpatterns.behavior.mediator;

public class TankUnit implements ArmedUnit {
    Commander commander;

    public TankUnit(Commander commander) {
        this.commander = commander;
    }

    @Override
    public void attack() {
        if (commander.canAttack()) {
            System.out.println("TankUnit: attacking...");
            commander.setAttackStatus(false);
        } else {
            System.out.println("TankUnit: other unit is attacking.. please wait..");
        }
    }

    @Override
    public void stopAttack() {
        System.out.println("TankUnit: stopping attack..");
        commander.setAttackStatus(true);
    }
}
