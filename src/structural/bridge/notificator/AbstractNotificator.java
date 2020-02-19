package structural.bridge.notificator;

import structural.bridge.notificationSender.NotificationSender;
import structural.bridge.UserData;

import java.util.List;

public abstract class AbstractNotificator implements Notificator {

    private NotificationSender notificationSender;
    private List<UserData> userDataList;

    public AbstractNotificator(NotificationSender notificationSender, List<UserData> userDataList) {
        this.notificationSender = notificationSender;
        this.userDataList = userDataList;
    }

    @Override
    public void sendNotification(UserData userData, String message) {
        notificationSender.send(userData, message);
    }

    @Override
    public List<UserData> getUsersList() {
        return userDataList;
    }
}
