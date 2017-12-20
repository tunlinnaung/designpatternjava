package com.my.designpatterns.structural.bridge;

public class TextMessage extends Message
{
    public TextMessage(MessageSender sender)
    {
        super(sender);
    }

    @Override
    public void send()
    {
        sender.sendMessage();
    }
}
