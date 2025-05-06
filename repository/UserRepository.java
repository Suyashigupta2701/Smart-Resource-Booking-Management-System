package repository;

// repository/UserRepository.java
import java.util.*;
import entity.*;
import java.util.*;
public class UserRepository {
    private Map<String, user> users = new HashMap<>();
    public void save(user user) { users.put(user.id, user); }
    public user findById(String id) { return users.get(id); }
    public Collection<user> findAll() { return users.values(); }
}
