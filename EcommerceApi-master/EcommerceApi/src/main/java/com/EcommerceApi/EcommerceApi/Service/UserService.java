package com.EcommerceApi.EcommerceApi.Service;

import com.EcommerceApi.EcommerceApi.Model.User;
import com.EcommerceApi.EcommerceApi.Repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;
    public String addUser(User user) {
        userRepo.save(user);
        return "User is Added";
    }

    public Optional<User> getUserById(Long id) {
        return userRepo.findById(id);
    }
}
