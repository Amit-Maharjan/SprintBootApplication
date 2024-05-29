package com.maharjan.amit.web.controller;

import com.maharjan.amit.web.model.User;
import com.maharjan.amit.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/add")
    public String addUser(){
        return "user/addUser";
    }

    @RequestMapping("/user/save")
    public ModelAndView saveUser(User user) {
        ModelAndView modelAndView = new ModelAndView("user/viewUser");
        modelAndView.addObject("name", user.getName());
        modelAndView.addObject("email", user.getEmail());

        userService.saveUser(user);

        return modelAndView;
    }

    @GetMapping("/user/getUsers")
    public ModelAndView getUsers(){
        ModelAndView mv = new ModelAndView("user/listUser");
        mv.addObject("data", userService.getUsers());
        return mv;
    }
}
