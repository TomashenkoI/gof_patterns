package structural.facade.user.service;

import structural.facade.user.repository.UserRepository;

public class UserService {

    private UserRepository userRepository;

    boolean checkIsLoginAvailable(String login) {
        return userRepository.checkIsLoginAvailable(login);
    }

}
