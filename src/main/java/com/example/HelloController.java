package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/")
    public String home() {
        return "Hello World! Welcome to Simple Java App";
    }
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot!";
    }
    
    @GetMapping("/api/status")
    public String status() {
        return "{\"status\": \"running\", \"app\": \"simple-java-app\"}";
    }
}
