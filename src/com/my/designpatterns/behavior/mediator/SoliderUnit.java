package com.my.designpatterns.behavior.mediator;

public class SoliderUnit implements ArmedUnit {
    Commander commander;

    public SoliderUnit(Commander commander) {
        this.commander = commander;
    }

    @Override
    public void attack() {
        if (commander.canAttack()) {
            System.out.println("SoliderUnit: attacking...");
            commander.setAttackStatus(false);
        } else {
            System.out.println("SoliderUnit: other unit is attacking.. please wait..");
        }
    }

    @Override
    public void stopAttack() {
        System.out.println("SoliderUnit: stopping attack..");
        commander.setAttackStatus(true);
    }
}
