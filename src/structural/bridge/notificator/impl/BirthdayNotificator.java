package structural.bridge.notificator.impl;

import structural.bridge.UserData;
import structural.bridge.notificationSender.NotificationSender;
import structural.bridge.notificator.AbstractNotificator;

import java.util.List;

public class BirthdayNotificator extends AbstractNotificator {

    public BirthdayNotificator(NotificationSender notificationSender, List<UserData> userDataList) {
        super(notificationSender, userDataList);
    }

    @Override
    public boolean check(UserData userData) {
        return userData.getDateOfBirth().getMonth() == userData.getDateOfBirth().getMonth() &&
                userData.getDateOfBirth().getDayOfMonth() == userData.getDateOfBirth().getDayOfMonth();
    }

    @Override
    public String getMessage(UserData userData) {
        return String.format("Happy Birthday %s !!!", userData.getName());
    }
}
