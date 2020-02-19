package creational.factoryMethod;

import creational.factoryMethod.notifacationSender.NotificationSender;
import creational.factoryMethod.notifacationSenderCreator.NotificationSenderCreator;
import creational.factoryMethod.notifacationSenderCreator.impl.EmailNotificationSenderCreator;
import creational.factoryMethod.notifacationSenderCreator.impl.SmsNotificationSenderCreator;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class FactoryMethodTest {

    @Test
    void test() {
        List<NotificationSenderCreator> senderCreators = Arrays.asList(new EmailNotificationSenderCreator(), new SmsNotificationSenderCreator());

        String message = "asd";

        for (NotificationSenderCreator senderCreator : senderCreators) {
            NotificationSender notificationSender = senderCreator.create();
            notificationSender.sendNotification(message);
        }
    }

}
