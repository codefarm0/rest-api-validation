package com.gl.userManagementApp.controller;

import com.gl.userManagementApp.dto.User;
import com.gl.userManagementApp.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@RestController
@Validated
public class UserController {

    Logger logger = LoggerFactory.getLogger("UserManagementApp");

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        logger.info("getting users..");
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable @Min(1000) int id) {
        return userService.getUser(id);
    }

    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    public User addUser(@RequestBody @Valid User user) {
        return userService.addUser(user);
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody @Valid User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/user/{id}")
    public User deleteUser(@PathVariable int id) {
        return userService.deleteUser(id);
    }

}
