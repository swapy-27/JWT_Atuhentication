package com.example.security.jwt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/demo")
public class DemoController {
    @GetMapping("/")
    public ResponseEntity<String> demo( ){
        return ResponseEntity.ok("<h1>Hii I am Swapnil</h1>");
    }
}
