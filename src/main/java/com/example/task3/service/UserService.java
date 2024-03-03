package com.example.task3.service;

import com.example.task3.entity.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalService {

    @Autowired
    @Qualifier("dog")
    private Animal dog;

    @Autowired
    @Qualifier("cat")
    private Animal cat;

    public void makeSounds(Animal animal) {
        animal.makeSound();
        animal.makeSound();
    }
}
