package org.example.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("pepsiconfig.xml");
        Pepsi p1 = (Pepsi)applicationContext.getBean("pepsi");
        System.out.println(p1);
        //registering shutdown hook
        applicationContext.registerShutdownHook();

    }
}
