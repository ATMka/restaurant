package com.epam.extlab.restaurant.service;

import com.epam.extlab.restaurant.entity.dto.User;
import com.epam.extlab.restaurant.repository.interfaces.IUserRepository;
import com.epam.extlab.restaurant.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public long addUser (User user){
        return userRepository.addUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public User getUserById(long userId){
        return userRepository.getUserById(userId);
    }

    @Override
    public int deleteUserById(long userId){
        return userRepository.deleteUserById(userId);
    }
}
