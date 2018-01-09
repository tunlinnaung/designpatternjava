package com.my.designpatterns.behavior.mediator;

public class MediatorTest {

    public static void main(String[] args) {
        Commander commander = new CommanderImpl();
        ArmedUnit soliderUnit = new SoliderUnit(commander);
        ArmedUnit tankUnit = new TankUnit(commander);
        commander.registerArmedUnit(soliderUnit, tankUnit);
        commander.startAttack(soliderUnit);
        commander.startAttack(tankUnit);
        commander.ceaseAttack(soliderUnit);
        commander.startAttack(tankUnit);
    }

}
