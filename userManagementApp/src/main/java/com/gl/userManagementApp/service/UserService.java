package com.gl.userManagementApp.service;

import com.gl.userManagementApp.dto.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUser(int id);

    User addUser(User user);

    User updateUser(User user);

    User deleteUser(int id);

}
