package com.epam.extlab.restaurant.controller;

import com.epam.extlab.restaurant.service.interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Autowired
    private IUserManager userManager;

    @Autowired
    private ICategoryService categoryService;

    @Autowired
    private IItemService itemService;

    @Autowired
    private IOrderPositionService orderPositionService;

    @Autowired
    private IOrderService orderService;

    @GetMapping("/main")
    public ModelAndView main(ModelAndView modelAndView){
        modelAndView.setViewName("main");
        modelAndView.addObject("userName",userManager.getCurrentUser().getLogin());
        return modelAndView;
    }
}
