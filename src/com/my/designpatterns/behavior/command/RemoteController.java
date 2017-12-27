package com.my.designpatterns.behavior.command;

public class RemoteController {
    CommandBase startCommand, stopCommand, undoCommand;

    public void onButtonPressed(CommandBase startCommand) {
        this.startCommand = startCommand;
        startCommand.execute();
        undoCommand = startCommand;
    }

    public void offButtonPressed(CommandBase stopCommand) {
        this.stopCommand = stopCommand;
        stopCommand.execute();
        undoCommand = stopCommand;
    }

    public void undoButtonPressed() {
        undoCommand.undo();
    }
}
