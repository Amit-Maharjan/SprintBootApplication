package com.maharjan.amit.web.controller;

import com.maharjan.amit.web.model.User;
import com.maharjan.amit.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(path = "/rest/user", consumes = {"application/json"})
    public User createUser(@RequestBody User user){
        userService.saveUser(user);
        return user;
    }
}
