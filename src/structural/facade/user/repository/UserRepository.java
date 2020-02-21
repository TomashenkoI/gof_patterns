package structural.facade.user.repository;

public interface UserRepository {

    boolean checkIsLoginAvailable(String login);

    void saveUserCredentials(String login, String encode);

}
