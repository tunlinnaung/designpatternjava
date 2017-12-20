package com.my.designpatterns.structural.bridge;

public class SmsMessage extends Message
{
    public SmsMessage(MessageSender sender)
    {
        super(sender);
    }

    @Override
    public void send() {
        sender.sendMessage();
    }
}
