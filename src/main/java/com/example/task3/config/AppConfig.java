package org.example.task3.config;

import org.example.task3.entity.Cat;
import org.example.task3.entity.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("org.example.task3.service")
public class AppConfig {

    @Bean(name = "dog")
    public Dog dog(){
        return new Dog();
    }
    @Bean(name = "cat")
    public Cat cat(){
        return new Cat();
    }
}
