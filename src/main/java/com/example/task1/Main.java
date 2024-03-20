package org.example.task1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-student.xml");
        Object student = applicationContext.getBean("student");
        System.out.println(student);
    }
}
