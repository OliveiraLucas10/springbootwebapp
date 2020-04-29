package com.oliveiralucaspro.repositories;

import com.oliveiralucaspro.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{
    User findByUsername(String username);
}
