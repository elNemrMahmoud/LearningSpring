package com.labs.day1.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class User {
    private int id;
    private String name;
    private static final Logger logger = LogManager.getLogger(User.class);


    public User(int id, String name) {

        this.id = id;
        this.name = name;
        logger.info("A User has been created with the details: ID: "+id+" Name:"+name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
