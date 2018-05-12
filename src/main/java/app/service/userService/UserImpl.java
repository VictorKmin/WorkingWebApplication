package app.service.userService;


import app.dao.UserDao;
import app.entity.User;
import app.service.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class UserImpl implements UserService {

    @Autowired
    UserDao userDao;


    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void save(User user) {
        if (user != null) {
        userDao.save(user);
        }
    }
}
