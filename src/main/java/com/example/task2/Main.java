package org.example.task2;

import org.example.task2.config.AppConfig;
import org.example.task2.entity.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        ctx.register(AppConfig.class);
        ctx.refresh();

        Student student= (Student) ctx.getBean("student");
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}
