package com.my.designpatterns.behavior.command;

public class RemoteControllerTest {

    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();
        Car car = new Car();

        System.out.println("Testing Car Move Command");
        CommandBase onStartCommand = new CarMoveCommand(car);
        remoteController.onButtonPressed(onStartCommand);

        System.out.println("Testing Car Stop Command");
        CommandBase onStopCommand = new CarStopCommand(car);
        remoteController.offButtonPressed(onStopCommand);

        System.out.println("Testing Car Undo Command");
        remoteController.undoButtonPressed();

        RotatingTop rotatingTop = new RotatingTop();

        System.out.println("Testing Start Rotating Command");
        CommandBase topRotateCommand = new TopRotateCommand(rotatingTop);
        remoteController.onButtonPressed(topRotateCommand);

        System.out.println("Testing Stop Rotating Command");
        CommandBase topStopRotateCommand = new TopStopRotateCommand(rotatingTop);
        remoteController.offButtonPressed(topStopRotateCommand);

        System.out.println("Testing Undo Rotating Command");
        remoteController.undoButtonPressed();
    }

}
