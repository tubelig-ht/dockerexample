package com.dockerexample.Docker.Example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController{

    @GetMapping("/message")
    public String sayHello(){
        return "Hello World!";
    }

}
