package org.example;

import org.example.collections.Employee;
import org.example.constructorinjection.Person;
import org.example.propertyinjection.Student;
import org.example.refernce.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args)
    {
        System.out.println("Hello and welcome!");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("propertyconfig.xml");
        Student student1 = (Student)applicationContext.getBean("student1");
        System.out.println(student1);
        Student student2 = (Student)applicationContext.getBean("student2");
        System.out.println(student2);

        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("collectionConfig.xml");
        Employee emp = (Employee) applicationContext1.getBean("employee");
        System.out.println(emp.getName());
        System.out.println(emp.getPhones());
        System.out.println(emp.getAddress());
        System.out.println(emp.getCourses());

        ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("referenceconfig.xml");
        A a = (A) applicationContext2.getBean("aref");
        System.out.println(a.getX());
        System.out.println(a.getB());

        ApplicationContext applicationContext3 = new ClassPathXmlApplicationContext("ciconfig.xml");
        Person p = (Person) applicationContext3.getBean("person");
        System.out.println(p);
        Person p1 = (Person) applicationContext3.getBean("person1");
        System.out.println(p1);
    }
}