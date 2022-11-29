package com.niit.jap.service;

import com.niit.jap.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> getAll();

    User getById(int id);

    User getByEmailAndPassword(String email, String password);
}
