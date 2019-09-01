package com.epam.extlab.restaurant.service;

import com.epam.extlab.restaurant.entity.dto.User;
import com.epam.extlab.restaurant.repository.interfaces.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;

    public long addUser (User user){
        return userRepository.addUser(user);
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public User getUserById(long user_id){
        return userRepository.getUserById(user_id);
    }

    public void deleteUserById(long user_id){
        userRepository.deleteUserById(user_id);
    }
}
