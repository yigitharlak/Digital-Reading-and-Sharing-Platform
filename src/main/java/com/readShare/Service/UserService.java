package com.readShare.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.readShare.Model.User;
import com.readShare.Model.Login;
import com.readShare.Dao.UserDao;
import java.util.List;

public class UserService {
    @Autowired
    public UserDao userDao;

    public int register(User user) {
        return userDao.register(user);
    }

    public User validate(Login login) {
        return userDao.validate(login);
    }

}
