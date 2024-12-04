package org.example.standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("standaloneconfig.xml");
        Person p = applicationContext.getBean("person", Person.class);
        System.out.println(p);
        System.out.println(p.getFriends().getClass().getName());

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Person p1 = applicationContext.getBean("person1", Person.class);
        System.out.println(p1.getFeestructure());
        System.out.println(p1.getFeestructure().getClass().getName());

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Person p2 = applicationContext.getBean("person2", Person.class);
        System.out.println(p2.getProperties());
        System.out.println(p2.getProperties().getClass().getName());

    }
}
