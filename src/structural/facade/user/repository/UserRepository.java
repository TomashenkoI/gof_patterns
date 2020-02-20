package structural.facade.user.repository;

public interface UserRepository {

    boolean checkIsLoginAvailable(String login);

}
