package com.userservice.controller;

import com.userservice.model.UserDetails;
import com.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    /*public UserController(UserService userService) {
        this.userService = userService;
    }*/

    // Get all users
    @GetMapping("getAll")
    public List<UserDetails> getAllUsers() {
        return userService.getAllUsers();
    }

    // Get user by ID
    @GetMapping("/{id}")
    public UserDetails getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @PostMapping("/saveuser")
    public UserDetails getUserById(@RequestBody UserDetails userDetails) {
        return userService.saveUserDetails(userDetails);
    }
}