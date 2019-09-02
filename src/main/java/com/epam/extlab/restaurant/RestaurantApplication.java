package com.epam.extlab.restaurant;

import com.epam.extlab.restaurant.config.Demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDateTime;

@SpringBootApplication
public class RestaurantApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(RestaurantApplication.class, args);
        Demo demoApp = context.getBean(Demo.class);
        demoApp.go();

    }

}