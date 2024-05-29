package com.maharjan.amit.web.dao;

import com.maharjan.amit.web.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<User, Integer> {
    List<User> findByPassword(String password);

    List<User> findByUserIdGreaterThan(Integer userId);

    @Query("from User where password=?1 order by name")
    List<User> findAllByPasswordAndSortedByName(String password);
}
