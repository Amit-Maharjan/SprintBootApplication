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

        return result;
    }
}
