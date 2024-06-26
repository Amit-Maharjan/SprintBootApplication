package com.maharjan.amit.web.dao;

import com.maharjan.amit.web.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Integer> {
    List<User> findByPassword(String password);

    List<User> findByUserIdGreaterThan(Integer userId);

    @Query("from User where password=?1 order by name")
    List<User> findAllByPasswordAndSortedByName(String password);

    @Query("select max(userId) from User")
    Integer findMaxId();
}
