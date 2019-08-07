package com.epam.extlab.restaurant.config;

import com.epam.extlab.restaurant.entity.Cat;
import com.epam.extlab.restaurant.entity.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationApp {
    @Bean
    public Cat getCat(){
        return new Cat();
    }

    @Bean
    public Dog getDog(){
        return new Dog();
    }
}
