package com.my.designpatterns.structural.bridge;

public class MessageSenderTest
{
    public static void main(String[] args)
    {
        MessageSender textMessageSender = new TextMessageSender();
        Message textMessage = new TextMessage(textMessageSender);
        textMessage.send();

        MessageSender smsMessageSender = new SmsMessageSender();
        Message smsMessage = new SmsMessage(smsMessageSender);
        smsMessage.send();
    }

}
