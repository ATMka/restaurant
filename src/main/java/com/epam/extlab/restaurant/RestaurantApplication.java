package com.epam.extlab.restaurant;

import com.epam.extlab.restaurant.config.ConfigurationApp;
import com.epam.extlab.restaurant.entity.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class RestaurantApplication {

	public static void main(String[] args) {
		//SpringApplication.run(RestaurantApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationApp.class);

		Cat cat = context.getBean("getCat",Cat.class);
		Dog dog = context.getBean("getDog",Dog.class);
		System.out.println(cat.getName());
		System.out.println(dog.getName());
	}

}
