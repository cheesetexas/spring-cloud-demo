package com.example.serviceborrow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ServiceBorrowApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceBorrowApplication.class, args);
    }

}
