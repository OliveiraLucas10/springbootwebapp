package com.oliveiralucaspro.repositories;

import org.springframework.data.repository.CrudRepository;

import com.oliveiralucaspro.domain.User;

public interface UserRepository extends CrudRepository<User, Integer>{
    User findByUsername(String username);
}
