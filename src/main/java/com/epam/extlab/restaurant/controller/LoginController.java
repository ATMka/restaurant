package com.epam.extlab.restaurant.controller;

import com.epam.extlab.restaurant.entity.dto.User;
import com.epam.extlab.restaurant.service.interfaces.IUserManager;
import com.epam.extlab.restaurant.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @Autowired
    private IUserService userService;

    @Autowired
    private IUserManager userManager;

    @GetMapping("/login")
    public ModelAndView login(ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @PostMapping("/login")
    public ModelAndView login(ModelAndView modelAndView, User user) {
        userService.authorize(user);
        modelAndView.setViewName("redirect:/main");
        return modelAndView;

    }
}
