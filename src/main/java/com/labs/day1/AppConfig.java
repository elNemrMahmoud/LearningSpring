package com.labs.day1;

import com.labs.day1.cyclicdep.A;
import com.labs.day1.cyclicdep.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean
    public B b() {
        return new B();
    }

    @Bean
    public A a() {
        return new A();
    }

    @Bean
    public Object injectDependencies(A a, B b) {
        a.setB(b);
        b.setA(a);
        return null;
    }
}
