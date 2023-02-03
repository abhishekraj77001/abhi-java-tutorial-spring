package com.devraz.javatutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/health")
    public String healthCheck()
    {
        return "Hello from Java Tutorial Backend";
    }
}
