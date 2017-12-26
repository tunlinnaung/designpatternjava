package com.my.designpatterns.behavior.chainofresponsibility;

public class TechnicalSupportHandler extends AbstractSupportHandler {

    public TechnicalSupportHandler(int level) {
        this.level = level;
    }

    @Override
    public void handleRequest(String message) {
        System.out.println("TechnicalSupportHandler: Processing request -> " + message);
    }
}
