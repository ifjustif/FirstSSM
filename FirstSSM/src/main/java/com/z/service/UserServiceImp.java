package com.z.service;

import com.z.dao.UserDao;
import com.z.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public int delUser(User user) {
        return userDao.delUser(user);
    }

    @Override
    public User loginUser(User user) {
        return userDao.loginUser(user);
    }

    @Override
    public int reviseUser(User user) {
        return userDao.reviseUser(user);
    }
}
