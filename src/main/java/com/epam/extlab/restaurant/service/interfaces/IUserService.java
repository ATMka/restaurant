package com.epam.extlab.restaurant.service.interfaces;

import com.epam.extlab.restaurant.entity.dto.User;

import java.util.List;

public interface IUserService {
    long addUser(User user);

    List<User> getAllUsers();

    User getUserById(long id);

    void deleteUserById(long id);
}
