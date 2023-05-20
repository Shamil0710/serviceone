package com.example.serviceone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ServiceoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceoneApplication.class, args);
    }

}
