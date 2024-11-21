package com.azuredevopsdemo.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomeController {
    @GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Welcome the world of programming...");
    }
}
