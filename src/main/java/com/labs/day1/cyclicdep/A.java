package com.labs.day1.cyclicdep;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//@Component
public class A {
    private B b;
    private static final Logger logger = LogManager.getLogger(A.class);

    public A(){
        logger.info("A wild A has appeared");
    }

    //Cyclic dependency using Setter method
    public void setB(B b) {
        this.b = b;
        logger.info("Setter method invoked in A class");
    }



}