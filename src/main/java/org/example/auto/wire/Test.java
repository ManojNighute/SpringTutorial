package org.example.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autoconfig.xml");
//        Employee emp = applicationContext.getBean("employee", Employee.class);
//        System.out.println(emp);

        Employee emp1 = applicationContext.getBean("employee1", Employee.class);
        System.out.println(emp1);
    }
}
