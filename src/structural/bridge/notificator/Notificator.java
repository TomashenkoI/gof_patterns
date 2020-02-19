package structural.bridge.notificator;

import structural.bridge.UserData;

import java.util.List;

public interface Notificator {

    boolean check(UserData userData);

    void sendNotification(UserData toUser, String message);

    String getMessage(UserData userData);

    List<UserData> getUsersList();

    default void run() {
        for (UserData userData : getUsersList()) {
            if (check(userData)) {
                sendNotification(userData, getMessage(userData));
            }
        }
    }

}
