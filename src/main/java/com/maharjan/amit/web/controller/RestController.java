package com.maharjan.amit.web.controller;

import com.maharjan.amit.web.model.User;
import com.maharjan.amit.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    private UserService userService;

    @GetMapping("/rest/users")
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

    @GetMapping(path = "/rest/user/{id}", produces = {"application/xml"})
    public User getUser(@PathVariable int id){
        return userService.getUserById(id);
    }
}
