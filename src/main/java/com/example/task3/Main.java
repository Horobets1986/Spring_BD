package org.example.task3;

import org.example.task3.config.AppConfig;
import org.example.task3.entity.Cat;
import org.example.task3.entity.Dog;
import org.example.task3.service.AnimalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        AnimalService animalService = context.getBean(AnimalService.class);
        animalService.makeSounds(new Cat());
        context.close();
    }
}
