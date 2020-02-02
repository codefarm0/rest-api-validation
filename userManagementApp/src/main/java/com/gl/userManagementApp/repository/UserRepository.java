package com.gl.userManagementApp.repository;

import org.springframework.stereotype.Repository;

import com.gl.userManagementApp.dto.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

    static List<User> userList = new ArrayList<>();

    public List<User> getAllUsers() {
        return userList;
    }

    public User getUser(int id) {
        Optional<User> first = userList.stream()
                .filter(u -> u.getId()==id)
                .findFirst();
        if(first.isPresent()){
            return first.get();
        }else{
            return new User();
        }
    }

    public User addUser(User user) {
        userList.add(user);
        return user;
    }

    public User updateUser(User user) {
        for(User u1 : userList){
            if(u1.getId()==(user.getId())){
                u1.setName(user.getName());
                u1.setAddress(user.getAddress());
                return u1;
            }
        }
        return new User();
    }

    public User deleteUser(int id) {
        Optional<User> first = userList.stream()
                .filter(u -> u.getId()==id)
                .findFirst();
        if(first.isPresent()){
            User user = first.get();
            userList.remove(user);
            return user;
        }else{
            return new User();
        }
    }
}
