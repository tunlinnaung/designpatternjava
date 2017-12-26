package com.my.designpatterns.behavior.chainofresponsibility;

public class RequestorClientTest {

    public static void main(String[] args) {
        AbstractSupportHandler handler = RequestorClient.getHandlerChain();
        handler.receiveRequest(AbstractSupportHandler.TECHNICAL, "please resolve for technical problem.");
        System.out.println("............................................");
        handler.receiveRequest(AbstractSupportHandler.BILLING, "billing have problem.");
        System.out.println("............................................");
        handler.receiveRequest(AbstractSupportHandler.GENERAL, "why loading so long.");
        System.out.println("............................................");
    }

}
