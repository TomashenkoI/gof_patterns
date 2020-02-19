package structural.bridge.notificator.impl;

import structural.bridge.UserData;
import structural.bridge.notificationSender.NotificationSender;
import structural.bridge.notificator.AbstractNotificator;

import java.time.LocalDate;
import java.util.List;

public class UserAnniversaryNotificator extends AbstractNotificator {

    public UserAnniversaryNotificator(NotificationSender notificationSender, List<UserData> userDataList) {
        super(notificationSender, userDataList);
    }

    @Override
    public boolean check(UserData userData) {
        LocalDate now = LocalDate.now();
        return !now.isEqual(userData.getRegistrationDate()) &&
                now.getMonth() == userData.getRegistrationDate().getMonth()
                && now.getDayOfMonth() == userData.getRegistrationDate().getDayOfMonth();
    }

    @Override
    public String getMessage(UserData userData) {
        int anniversaryYear = LocalDate.now().getYear() - userData.getRegistrationDate().getYear();
        return String.format("today is your %d year anniversary", anniversaryYear) ;
    }

}
