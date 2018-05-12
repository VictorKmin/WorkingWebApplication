package app.service.userService;

import app.entity.User;

import java.util.List;


public interface UserService{

    public List<User> findAll();
    void save(User user);
}
