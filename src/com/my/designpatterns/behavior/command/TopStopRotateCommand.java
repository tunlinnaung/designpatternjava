package com.my.designpatterns.behavior.command;

public class TopStopRotateCommand implements CommandBase {
    private RotatingTop rotatingTop;

    public TopStopRotateCommand(RotatingTop rotatingTop) {
        this.rotatingTop = rotatingTop;
    }

    @Override
    public void execute() {
        System.out.println("TopStopRotateCommand.execute() -> Executing top rotate stop command.");
        rotatingTop.stopRotating();
    }

    @Override
    public void undo() {
        System.out.println("TopStopRotateCommand.undo() -> Executing top rotate start command.");
        rotatingTop.startRotating();
    }
}
