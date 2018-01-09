package com.my.designpatterns.behavior.mediator;

public class CommanderImpl implements Commander {
    ArmedUnit soliderUnit, tankUnit;
    boolean attachStatus = true;

    @Override
    public void registerArmedUnit(ArmedUnit soliderUnit, ArmedUnit tankUnit) {
        this.soliderUnit = soliderUnit;
        this.tankUnit = tankUnit;
    }

    @Override
    public void setAttackStatus(boolean attackStatus) {
        this.attachStatus = attackStatus;
    }

    @Override
    public boolean canAttack() {
        return attachStatus;
    }

    @Override
    public void startAttack(ArmedUnit armedUnit) {
        armedUnit.attack();
    }

    @Override
    public void ceaseAttack(ArmedUnit armedUnit) {
        armedUnit.stopAttack();
    }
}
