package com.my.designpatterns.behavior.chainofresponsibility;

public class GeneralSupportHandler extends AbstractSupportHandler {

    public GeneralSupportHandler(int level) {
        this.level = level;
    }

    @Override
    public void handleRequest(String message) {
        System.out.println("GeneralSupportHandler: Processing request -> " + message);
    }
}
