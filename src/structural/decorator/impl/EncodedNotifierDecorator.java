package structural.decorator.impl;

import structural.decorator.Notifier;
import structural.decorator.impl.BaseNotifierDecorator;

import java.util.Base64;

public class EncodedNotifierDecorator extends BaseNotifierDecorator {

    public EncodedNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        String encodedString = Base64.getEncoder().encodeToString(message.getBytes());
        super.send(encodedString);
    }
}
