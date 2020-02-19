package creational.factoryMethod.notifacationSenderCreator.impl;

import creational.factoryMethod.notifacationSender.Impl.EmailNotificationSender;
import creational.factoryMethod.notifacationSender.NotificationSender;
import creational.factoryMethod.notifacationSenderCreator.NotificationSenderCreator;

public class EmailNotificationSenderCreator implements NotificationSenderCreator {
    @Override
    public NotificationSender create() {
        return new EmailNotificationSender();
    }
}
