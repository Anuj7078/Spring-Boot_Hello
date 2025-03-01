package com.example.springboot_hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloUsingGet {
    @GetMapping("/hello")
    public String hello() {
        return "Hello From BridgeLabz";
    }
}
