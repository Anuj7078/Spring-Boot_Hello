package com.example.springboot_hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @PutMapping("/hello/put/{firstname}")
    public String hello(
            @PathVariable String firstname,
            @RequestParam String lastname
    ){
        return "Hello, " + firstname + " " + lastname + " from BridgeLabz! 🚀";
    }
}
