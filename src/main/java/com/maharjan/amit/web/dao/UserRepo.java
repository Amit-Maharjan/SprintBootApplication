package com.maharjan.amit.web.dao;

import com.maharjan.amit.web.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {

}
