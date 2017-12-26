package com.my.designpatterns.behavior.chainofresponsibility;

public abstract class AbstractSupportHandler {

    public static int TECHNICAL = 10;
    public static int BILLING = 20;
    public static int GENERAL = 30;

    protected int level;

    protected AbstractSupportHandler nextHandler;

    public void setNextHandler(AbstractSupportHandler handler) {
        this.nextHandler = handler;
    }

    public void receiveRequest(int level, String message) {
        if (this.level <= level) {
            handleRequest(message);
        }
        if (nextHandler != null) {
            nextHandler.receiveRequest(level, message);
            // receiveRequest(level, message) failed with IndexOutOfBoundException()
        }
    }

    protected abstract void handleRequest(String message);

}
