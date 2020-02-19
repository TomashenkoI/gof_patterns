package creational.factoryMethod.notifacationSender.Impl;

import creational.factoryMethod.notifacationSender.NotificationSender;

public class SmsNotificationSender implements NotificationSender {
    @Override
    public void sendNotification(String message) {
        System.out.println(String.format("Send sms: %s", message));
    }
}
