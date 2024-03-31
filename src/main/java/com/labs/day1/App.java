package com.labs.day1;

import com.labs.day1.cyclicdep.A;
import com.labs.day1.cyclicdep.B;
import com.labs.day1.dao.User;
import com.labs.day1.service.UserService;
import com.labs.day1.service.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args) {

        ClassPathXmlApplicationContext xmlContext = new ClassPathXmlApplicationContext("applicationContext.xml");

//        //Get Service using XML context
//        UserService userService = xmlContext.getBean("userservice", UserService.class);
//        userService.addUser(xmlContext.getBean(User.class));

//        //Get Service by static factory
//        UserService userFacService = xmlContext.getBean("userServiceStaticFactory", UserService.class);
//        userFacService.addUser(new User(1,"Habazlam"));

        //Get Service by Factory
        UserService userService = xmlContext.getBean("userServiceByFactory",UserServiceImpl.class);
        userService.addUser(xmlContext.getBean("user",User.class));


        //Cyclic dependencies using setter
        A aService = (A) xmlContext.getBean("a");
        B bService = (B) xmlContext.getBean("b");


    }
}
