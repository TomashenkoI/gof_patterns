package structural.facade.user.service;

import structural.facade.user.repository.UserRepository;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public boolean checkIsLoginAvailable(String login) {
        return userRepository.checkIsLoginAvailable(login);
    }

    @Override
    public void saveUserCredentials(String login, String encode) {
        userRepository.saveUserCredentials(login, encode);
    }

}
