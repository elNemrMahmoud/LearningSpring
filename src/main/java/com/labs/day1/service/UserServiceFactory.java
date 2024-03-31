package com.labs.day1.service;

import com.labs.day1.dao.UserDao;

public class UserServiceFactory {
    public UserServiceImpl createService(UserDao implementation){
        return new UserServiceImpl(implementation);
    }
}
