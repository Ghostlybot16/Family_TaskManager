package com.familytaskmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Application {

    // Main entry point of the application.
    public static void main(String[] args) {

        // SpringApplication.run() launches the spring boot app
        SpringApplication.run(Application.class, args);
    }
}