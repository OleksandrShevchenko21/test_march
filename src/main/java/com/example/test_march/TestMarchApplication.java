package com.example.test_march;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class TestMarchApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestMarchApplication.class, args);
    }

}
