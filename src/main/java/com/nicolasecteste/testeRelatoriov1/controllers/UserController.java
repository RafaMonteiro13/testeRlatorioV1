package com.nicolasecteste.testeRelatoriov1.controllers;

import com.nicolasecteste.testeRelatoriov1.entities.User;
import com.nicolasecteste.testeRelatoriov1.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<User> findAll(){
    List <User> result = repository.findAll();
    return result;
    }
}
