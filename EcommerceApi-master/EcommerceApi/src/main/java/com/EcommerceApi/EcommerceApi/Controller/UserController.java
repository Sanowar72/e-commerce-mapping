package com.EcommerceApi.EcommerceApi.Controller;

import com.EcommerceApi.EcommerceApi.Model.User;
import com.EcommerceApi.EcommerceApi.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("user")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }
    @GetMapping("user/{id}")
    public Optional<User> getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

}
