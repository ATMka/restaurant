package com.epam.extlab.restaurant;

import com.epam.extlab.restaurant.config.AppConfig;
import com.epam.extlab.restaurant.entity.dto.User;
import com.epam.extlab.restaurant.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDateTime;

@SpringBootApplication
public class RestaurantApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(RestaurantApplication.class, args);

        UserService userService = context.getBean(UserService.class);

        //userService.addItem(new User(1,"Alex","atmka","111",true, LocalDateTime.now()));
        System.out.println(userService.getUserById(1).getFullname());
    }

}