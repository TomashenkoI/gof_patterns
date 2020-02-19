package structural.decorator.impl;

import structural.decorator.Notifier;
import structural.decorator.impl.BaseNotifierDecorator;

import java.time.LocalDateTime;
import java.util.Date;

public class LoggedNotifierDecorator extends BaseNotifierDecorator {

    public LoggedNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        System.out.println(LocalDateTime.now() + " message is sending");
        super.send(message);
        System.out.println(LocalDateTime.now() + " message has been sent");
    }
}
