package com.my.designpatterns.behavior.mediator;

public interface Commander {
    void registerArmedUnit(ArmedUnit soliderUnit, ArmedUnit tankUnit);
    void setAttackStatus(boolean attackStatus);
    boolean canAttack();
    void startAttack(ArmedUnit armedUnit);
    void ceaseAttack(ArmedUnit armedUnit);
}
