package com.labs.day1.service;

import com.labs.day1.dao.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public void addUser(User user);
    public User getUserById(int id);
    public User getLastUser();
}
