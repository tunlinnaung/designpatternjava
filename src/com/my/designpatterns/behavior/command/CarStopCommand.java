package com.my.designpatterns.behavior.command;

public class CarStopCommand implements CommandBase {
    private Car car;

    public CarStopCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        System.out.println("CarStopCommand.execute() -> Executing car stop command.");
        car.stop();
    }

    @Override
    public void undo() {
        System.out.println("CarStopCommand.undo() -> Executing car undo command.");
        car.move();
    }
}
