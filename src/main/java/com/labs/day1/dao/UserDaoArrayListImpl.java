package com.labs.day1.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;


public class UserDaoArrayListImpl implements UserDao {

    private static final Logger logger = LogManager.getLogger(UserDaoArrayListImpl.class);

    private ArrayList<User> usersArraylist;

    public UserDaoArrayListImpl(){
        usersArraylist = new ArrayList<>();
    }

    @Override
    public void addUser(User newUser) {
        usersArraylist.add(newUser);
        logger.info("User added by ArraylistImpl: " + newUser);
    }

    @Override
    public User getLastUser() {
        if (!usersArraylist.isEmpty()) {
            return usersArraylist.get(usersArraylist.size() - 1);
        } else {
            logger.warn("No users found");
            return null;
        }
    }

    @Override
    public User getUserById(int userId) {
        for (User user : usersArraylist) {
            if (user.getId() == userId) {
                logger.info("User found by ID: " + user);
                return user;
            }
        }
        logger.warn("User not found with ID: " + userId);
        return null;
    }
}
