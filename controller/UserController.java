package controller;

// controller/UserController.java
import service.UserService;
import entity.user;

public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public user login(String id) {
        return userService.login(id);
    }
}
