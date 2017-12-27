package com.my.designpatterns.behavior.command;

public class CarMoveCommand implements CommandBase {
    private Car car;

    public CarMoveCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        System.out.println("CarMoveCommand.execute() -> Executing car move command.");
        car.move();
    }

    @Override
    public void undo() {
        System.out.println("CarMoveCommand.undo() -> Executing car undo command.");
        car.stop();
    }
}
