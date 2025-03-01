package com.example.springboot_hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerUC3 {
    @GetMapping("/hello/param/{name}")
    public String hello(@PathVariable String name){
        return "Hello, " + name + " from BridgeLabz! 🚀";
    }
}
