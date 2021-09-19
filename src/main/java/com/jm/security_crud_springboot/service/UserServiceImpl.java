package com.jm.security_crud_springboot.service;

import com.jm.security_crud_springboot.DAO.UserDAO;
import com.jm.security_crud_springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(final UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public void updateUser(final User user) {
        userDAO.updateUser(user);
    }

    @Override
    public User getUser(final int id) {
        return userDAO.getUser(id);
    }

    @Override
    public void deleteUser(final int id) {
        userDAO.deleteUser(id);
    }

    @Override
    public User findByUsername(String username) {
        return userDAO.findUserByUsername(username);
    }

    @Override
    public void saveUser(String name, String surname, int age, String email, String username, String password) {
        userDAO.saveUser(name, surname, age, email, username, password);
    }
}
