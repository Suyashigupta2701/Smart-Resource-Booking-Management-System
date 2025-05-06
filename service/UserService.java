package service;
import java.util.*;
// service/UserService.java
import repository.UserRepository;
import entity.*;

public class UserService {
    private UserRepository repo = new UserRepository();

    public void register(user user) { repo.save(user); }
    public user login(String id) { return repo.findById(id); }
}

