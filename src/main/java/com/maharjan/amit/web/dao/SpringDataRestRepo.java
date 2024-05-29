package com.maharjan.amit.web.dao;

import com.maharjan.amit.web.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface SpringDataRestRepo extends JpaRepository<User, Integer> {
}
