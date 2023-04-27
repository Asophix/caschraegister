package com.example.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootApplication
public class BackendApplication {

    // Backend should be used for persistance and calculation
    // DAO/DTO layer
    // calculator service
    // event handler
    // ... ?

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }




}
