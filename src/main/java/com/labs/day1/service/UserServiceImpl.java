package com.labs.day1.service;

import com.labs.day1.dao.User;
import com.labs.day1.dao.UserDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserServiceImpl implements UserService{
    private final UserDao userDao;
    private static final Logger logger = LogManager.getLogger(UserServiceImpl.class);
    public UserServiceImpl(UserDao daoimpl){
        userDao = daoimpl;
        logger.info("User Service Created");
    }
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public User getLastUser() {
        return userDao.getLastUser();
    }
}
