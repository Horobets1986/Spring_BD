package org.example.spring_bd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        UserController userController = context.getBean(UserController.class);

        createUser(userController);
        updateUser(userController);
        deleteUser(userController);
        getById(userController);
        getAll(userController);
    }

    private static void createUser(UserController userController) {
        User user = new User();
        user.setFullName("Pit");
        userController.createUser(user);
    }

    private static void updateUser(UserController userController) {
        User user = new User();
        user.setFullName("Bull");
        userController.updateUser(10L, user);
    }

    private static void deleteUser(UserController userController) {
        userController.deleteUser(11L);
    }

    private static void getById(UserController userController) {
        User userById = userController.getUserById(2L);
        System.out.println(userById);
    }

    private static void getAll(UserController userController) {
        List<User> allUsers = userController.getAllUsers();
        System.out.println(allUsers);
    }
}