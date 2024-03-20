package org.example.task2.config;

import org.example.task2.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "student")
    public Student student(){
        Student student= new Student();
        student.setName("Pit");
        student.setAge(30);
        return student;
    }
}
