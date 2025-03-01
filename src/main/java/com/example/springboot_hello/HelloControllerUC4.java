package com.example.springboot_hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerUC4 {
    @PostMapping("/hello/post")
    public String hello(@RequestBody User user){
        return "Hello, " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz! 🚀";
    }
}
