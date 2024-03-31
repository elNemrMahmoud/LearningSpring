package com.labs.day1.dao;

public interface UserDao {
    void addUser(User newUser);
    User getUserById(int Userid);
    User getLastUser();

}
