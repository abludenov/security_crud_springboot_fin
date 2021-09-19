package com.jm.security_crud_springboot.service;


import com.jm.security_crud_springboot.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void updateUser(User user);

    User getUser(int id);

    void deleteUser(int id);

    User findByUsername(String username);

    void saveUser(String name, String surname, int age, String email, String username, String password);
}
