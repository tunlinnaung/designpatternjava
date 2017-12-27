package com.my.designpatterns.behavior.command;

public class TopRotateCommand implements CommandBase {
    private RotatingTop rotatingTop;

    public TopRotateCommand(RotatingTop rotatingTop) {
        this.rotatingTop = rotatingTop;
    }

    @Override
    public void execute() {
        System.out.println("TopRotateCommand.execute() -> Executing top rotate start command.");
        rotatingTop.startRotating();
    }

    @Override
    public void undo() {
        System.out.println("TopRotateCommand.undo() -> Executing top rotate stop command.");
        rotatingTop.stopRotating();
    }
}
