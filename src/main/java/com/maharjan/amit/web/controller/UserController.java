package com.maharjan.amit.web.controller;

import com.maharjan.amit.web.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @GetMapping("/user/add")
    public String addUser(){
        return "user/addUser";
    }

    @RequestMapping("/user/save")
    public ModelAndView saveUser(User user) {
        System.out.println("_____");
        ModelAndView modelAndView = new ModelAndView("user/viewUser");
        modelAndView.addObject("name", user.getName());
        modelAndView.addObject("email", user.getEmail());
        return modelAndView;
    }
}
