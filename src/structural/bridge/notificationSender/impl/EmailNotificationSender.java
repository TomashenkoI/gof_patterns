package structural.bridge.notificationSender.impl;

import structural.bridge.UserData;
import structural.bridge.notificationSender.NotificationSender;

public class EmailNotificationSender implements NotificationSender {

    @Override
    public void send(UserData userData, String message) {
        System.out.println(String.format("send email message:\n %s\n to %s", message, userData.getEmail()));
    }
}
