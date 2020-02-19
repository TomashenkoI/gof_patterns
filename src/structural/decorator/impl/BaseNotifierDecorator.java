package structural.decorator.impl;

import structural.decorator.Notifier;

public class BaseNotifierDecorator implements Notifier {

    private Notifier notifier;

    public BaseNotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        notifier.send(message);
    }
}
