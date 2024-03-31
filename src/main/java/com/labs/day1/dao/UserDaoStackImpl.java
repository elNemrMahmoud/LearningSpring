package com.labs.day1.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Stack;

public class UserDaoStackImpl implements UserDao {

    private static final Logger logger = LogManager.getLogger(UserDaoStackImpl.class);

    private Stack<User> users;

    public UserDaoStackImpl() {
        users = new Stack<>();
    }

    @Override
    public void addUser(User newUser) {
        users.push(newUser);
        logger.info("User added by Stack Impl: " + newUser);
    }

    @Override
    public User getUserById(int userId) {
        for (User user : users) {
            if (user.getId() == userId) {
                logger.info("User found by ID: " + user);
                return user;
            }
        }
        logger.warn("User not found with ID: " + userId);
        return null;
    }

    @Override
    public User getLastUser() {
        if (!users.isEmpty()) {
            User lastUser = users.pop();
            logger.info("Last user retrieved: " + lastUser);
            return lastUser;
        } else {
            logger.warn("No users available to retrieve");
            return null;
        }
    }
}
