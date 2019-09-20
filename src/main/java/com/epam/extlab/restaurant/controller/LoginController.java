package com.epam.extlab.restaurant.controller;

import com.epam.extlab.restaurant.entity.dto.User;
import com.epam.extlab.restaurant.service.interfaces.IUserManager;
import com.epam.extlab.restaurant.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

    @GetMapping("/logout")
    public ModelAndView logout(ModelAndView modelAndView, HttpServletRequest request, HttpServletResponse response) {
        modelAndView.setViewName("index");
        request.getSession().invalidate();
        return modelAndView;
    }

    @GetMapping("/registration")
    public ModelAndView registration(ModelAndView modelAndView) {
        modelAndView.setViewName("registration");
        return modelAndView;
    }

    @PostMapping("/registration")
    public ModelAndView registration(ModelAndView modelAndView, @Validated User user, BindingResult result) {
        if (result.hasErrors()) {
            modelAndView.addObject("errors", result.getAllErrors());
            modelAndView.setViewName("registration");
        } else {
            userService.addUserLoginPassword(user);
            userService.authorize(user);
            modelAndView.setViewName("redirect:/main");

        }

        return modelAndView;
    }
}
