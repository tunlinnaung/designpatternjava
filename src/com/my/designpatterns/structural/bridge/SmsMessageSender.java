package com.my.designpatterns.structural.bridge;

public class SmsMessageSender implements MessageSender
{
    @Override
    public void sendMessage()
    {
        System.out.println("Sms message sending...");
    }
}
