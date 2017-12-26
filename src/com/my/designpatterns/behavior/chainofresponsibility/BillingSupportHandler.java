package com.my.designpatterns.behavior.chainofresponsibility;

public class BillingSupportHandler extends AbstractSupportHandler {

    public BillingSupportHandler(int level) {
        this.level = level;
    }

    @Override
    public void handleRequest(String message) {
        System.out.println("BillingSupportHandler: Processing request -> " + message);
    }
}
