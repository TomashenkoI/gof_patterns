package creational.factoryMethod.notifacationSender.Impl;

import creational.factoryMethod.notifacationSender.NotificationSender;

public class EmailNotificationSender implements NotificationSender {
    @Override
    public void sendNotification(String message) {
        System.out.println(String.format("Send email: %s", message));
    }
}
