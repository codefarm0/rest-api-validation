package com.gl.userManagementApp.service;

import com.gl.userManagementApp.dto.User;
import com.gl.userManagementApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public User getUser(int id) {
        return userRepository.getUser(id);
    }

    @Override
    public User addUser(User user) {
        return userRepository.addUser(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.updateUser(user);
    }

    @Override
    public User deleteUser(int id) {
        return userRepository.deleteUser(id);
    }
}
