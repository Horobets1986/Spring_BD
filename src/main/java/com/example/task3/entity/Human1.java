package com.example.task3.entity;

import org.springframework.stereotype.Component;

@Component("dog")
public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
