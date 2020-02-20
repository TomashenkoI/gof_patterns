package structural.facade;


import structural.facade.user.service.UserService;

public class ApplicationFacadeImpl implements ApplicationFacade {

    private UserService userService;

    @Override
    public void registerUser(String login, String password) {

    }
}
