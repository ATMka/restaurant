package com.epam.extlab.restaurant.config;

import com.epam.extlab.restaurant.entity.dto.Category;
import com.epam.extlab.restaurant.entity.dto.Item;
import com.epam.extlab.restaurant.entity.dto.User;
import com.epam.extlab.restaurant.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Demo {
    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderPositionService orderPositionService;

    @Autowired
    private ItemService itemService;

    @Autowired
    private CategoryService categoryService;

    public void go(){
//        userService.addUser(new User(1, "Tom Tompkins", "login1","111",false, LocalDateTime.now()));
//        userService.addUser(new User(0, "Tom Holland", "login2","111",false, LocalDateTime.now()));
//        userService.addUser(new User(1, "Васька Петров", "login3","111",false, LocalDateTime.now()));
//        userService.addUser(new User(0, "Антон Шевчук", "login4","111",true, LocalDateTime.now()));
//        userService.addUser(new User(0, "Алексей Биянов", "login5","111",true, LocalDateTime.now()));
//        userService.addUser(new User(1, "Какой-то чел", "login6","111",false, LocalDateTime.now()));
//        userService.addUser(new User(0, "Ещё один непонятный", "login7","111",false, LocalDateTime.now()));

        for (User user:userService.getAllUsers()) {
            System.out.println(user);
        }

        if (userService.deleteUserById(24) == 1){
            System.out.println("Пользователь удален");
        } else{
            System.out.println("Пользователь не найден. Удаление невозможно.");
        }

        categoryService.addCategory(new Category(null, "Горячие блюда", "Самые горячие блюда", 1, LocalDateTime.now()));

        for (Category category:categoryService.getAllCategories()) {
            System.out.println(category);
        }
    }
}
