package com.labs.day1.cyclicdep;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//@Component
public class B {
    private A a;
    private static final Logger logger = LogManager.getLogger(B.class);

    public B(){
        logger.info("A wild B has appeared");
    }

    //Cyclic dependency using Setter method
    public void setA(A a) {
        this.a = a;
        logger.info("Setter method invoked in B class");
    }


}