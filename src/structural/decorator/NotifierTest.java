package structural.decorator;

import org.junit.jupiter.api.Test;
import structural.decorator.impl.EncodedNotifierDecorator;
import structural.decorator.impl.LoggedNotifierDecorator;
import structural.decorator.impl.NotifierImpl;

class NotifierTest {

    @Test
    void test() {
        String message = "test message";

        Notifier decoratedNotifier = new LoggedNotifierDecorator(
                                        new EncodedNotifierDecorator(
                                                new NotifierImpl()));

        decoratedNotifier.send(message);
    }

}