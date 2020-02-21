package structural.facade.user.service;

public interface UserService {

    boolean checkIsLoginAvailable(String login);

    void saveUserCredentials(String login, String encode);

}
