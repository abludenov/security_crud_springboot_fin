package com.jm.security_crud_springboot.DAO;


import com.jm.security_crud_springboot.entity.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    void updateUser(User user);

    User getUser(int id);

    void deleteUser(int id);

    User findUserByUsername(String username);

    void saveUser(String name, String surname, int age, String email, String username, String password);
}
