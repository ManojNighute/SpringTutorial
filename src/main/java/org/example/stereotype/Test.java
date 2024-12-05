package org.example.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("stereoconfig.xml");
        Associate associate = applicationContext.getBean("associate",Associate.class);
//        System.out.println(associate.hashCode());

        Associate associate1 = applicationContext.getBean("associate",Associate.class);
//        System.out.println(associate1.hashCode());

        Teacher t1 = applicationContext.getBean("teacher",Teacher.class);
        Teacher t2 = applicationContext.getBean("teacher",Teacher.class);
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
    }
}
