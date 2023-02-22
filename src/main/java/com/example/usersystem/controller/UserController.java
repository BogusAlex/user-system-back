package com.example.usersystem.controller;

import com.example.usersystem.entities.User;
import com.example.usersystem.repository.UserRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    // atributos
    private UserRepository userRepository;
    // contructores

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    // CRUD sobre la entidad User

    // Buscar todos los libros (lista de usuarios)

    /**
     * http://localhost:8081/api/users
     * @return
     */
    @GetMapping("/api/users")
    public List<User> findAll(){
        // recuperar y devolver los usuarios de base de datos
        return userRepository.findAll();
    }


    /**
     * Request
     * Response
     * @param id
     * @return
     */
    // buscar un solo usuario en base de datos segun su id
    @GetMapping("/api/users/{id}")
    public ResponseEntity<User> findOneById(@PathVariable Long id){

        Optional<User> userOpt = userRepository.findById(id);

        if(userOpt.isPresent())
            return ResponseEntity.ok(userOpt.get());
        return ResponseEntity.notFound().build();
    }



    // crear un nuevo usuario en base de datos
    @PostMapping("/api/users")
    public User create(@RequestBody User user, @RequestHeader HttpHeaders headers){
        System.out.println(headers.get("User-Agent"));
        // guardar el usuario recibido por parámetro en la base de datos
        return userRepository.save(user);
    }


    // actualizar un libro existente en base de datos

    // borrar un libro en base de datos
}
