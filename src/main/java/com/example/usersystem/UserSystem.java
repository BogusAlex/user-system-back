package com.example.usersystem;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class UserSystem {

    public static void main(String[] args) {

        SpringApplication.run(UserSystem.class, args);

//        // CRUD
//        // crear user
//        User user1 = new User(null, "alex", "bogus", "example1@gmail.com", "12345");
//        User user2 = new User(null, "ari", "bogus", "example2@gmail.com", "12345");
//        // almacenar un libro
//        System.out.println("Num usuarios en base de datos: " + repository.findAll().size());
//
//        repository.save(user1);
//        repository.save(user2);
//
//        // recuperar todos los usuarios
//        System.out.println("Num usuarios en base de datos: " + repository.findAll().size());
//
//        // borrar un usuario
//        // repository.deleteById(1L);
//
//        System.out.println("Num usuarios en base de datos: " + repository.findAll().size());

    }

}
