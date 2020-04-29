package com.oliveiralucaspro.services;

import com.oliveiralucaspro.domain.User;

public interface UserService extends CRUDService<User> {

    User findByUsername(String username);

}
