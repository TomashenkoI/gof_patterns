package creational.factoryMethod.notifacationSenderCreator.impl;

import creational.factoryMethod.notifacationSender.Impl.SmsNotificationSender;
import creational.factoryMethod.notifacationSender.NotificationSender;
import creational.factoryMethod.notifacationSenderCreator.NotificationSenderCreator;

public class SmsNotificationSenderCreator implements NotificationSenderCreator {
    @Override
    public NotificationSender create() {
        return new SmsNotificationSender();
    }
}
