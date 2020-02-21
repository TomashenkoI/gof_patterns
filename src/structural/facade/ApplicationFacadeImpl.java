package structural.facade;


import structural.facade.encoder.PasswordEncoder;
import structural.facade.event.publisher.UserEventPublisher;
import structural.facade.user.service.UserService;

public class ApplicationFacadeImpl implements ApplicationFacade {

    private UserService userService;
    private PasswordEncoder passwordEncoder;
    private UserEventPublisher userEventPublisher;

    public ApplicationFacadeImpl(UserService userService, PasswordEncoder passwordEncoder, UserEventPublisher userEventPublisher) {
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
        this.userEventPublisher = userEventPublisher;
    }

    @Override
    public void registerUser(String login, String password) {
        boolean isLoginAvailable = userService.checkIsLoginAvailable(login);
        if (isLoginAvailable) {
            String encodedPassword = passwordEncoder.encode(password);
            userService.saveUserCredentials(login, encodedPassword);
        }
        userEventPublisher.publish(login);
    }
}
