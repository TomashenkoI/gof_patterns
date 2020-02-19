package structural.bridge.notificationSender;

import structural.bridge.UserData;

public interface NotificationSender {

    void send(UserData userData, String message);

}
