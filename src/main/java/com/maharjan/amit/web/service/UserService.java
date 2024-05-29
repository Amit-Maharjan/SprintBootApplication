package com.maharjan.amit.web.service;

import com.maharjan.amit.web.model.User;
import com.maharjan.amit.web.dao.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public void saveUser(User user){
        userRepo.save(user);
        System.out.println("User saved");
    }

    public String getUsers() {
        User user = userRepo.findById(101).orElse(new User());
        String result = user.toString();

        System.out.println(userRepo.findAll());

        System.out.println(userRepo.findByPassword("password"));

        System.out.println(userRepo.findByUserIdGreaterThan(102));

        System.out.println(userRepo.findAllByPasswordAndSortedByName("password"));

        return result;
    }
}
