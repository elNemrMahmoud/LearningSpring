package com.labs.day1.service;

import com.labs.day1.dao.UserDao;

public class UserServiceStaticFactory {

    public static UserServiceImpl createService(UserDao implementation){
        return new UserServiceImpl(implementation);
    }
}
