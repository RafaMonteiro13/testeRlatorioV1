package com.nicolasecteste.testeRelatoriov1.controllers;

import com.nicolasecteste.testeRelatoriov1.entities.User;
import com.nicolasecteste.testeRelatoriov1.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Tranforma essa classe em um controlador que responde por requisições
@RestController
//Caminho que esse controlador vai responder, localhost:8080/users é esse cara q estou acessando
@RequestMapping(value = "/users")
public class UserController {
    //Instancia um objeto de forma automatica, sem dar o new
    @Autowired
    private UserRepository repository;

    @GetMapping
    //Informar qual o verbo http tu esta usando no caso GET
    public List<User> findAll() {
        List<User> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    //pathVariable serve para referenciar o id do método http com o id variavel
    public User findAById(@PathVariable Long id) {
        //get serve oara pegar o usario de fato dentro desse obj
        User result = repository.findById(id).get();
        return result;
    }

    @PostMapping
    //Usuario para salvar aparace no corpo da requisição post
    public User insert(@RequestBody User user) {
        User result = repository.save(user);
        return result;
    }
}
