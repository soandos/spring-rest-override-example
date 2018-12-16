package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.repositories.Entity0DataRestRepository;

@SpringBootApplication
public class MyApp {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    Entity0DataRestRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }
}
