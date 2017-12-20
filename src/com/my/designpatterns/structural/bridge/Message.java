package com.my.designpatterns.structural.bridge;

public abstract class Message
{
    MessageSender sender;

    public Message(MessageSender sender) {
        this.sender = sender;
    }

    public abstract void send();
}
