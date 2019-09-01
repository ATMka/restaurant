package com.epam.extlab.restaurant.repository.interfaces;

import com.epam.extlab.restaurant.entity.dto.User;

import java.util.List;

public interface ICategoryRepository {
    long addUser(User user);

    List<User> getAllUsers();

    User getUserById(long id);

    int deleteUserById(long id);
}
