package structural.decorator.impl;

import structural.decorator.Notifier;

public class NotifierImpl implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("send message '" + message + "'");
    }
}
