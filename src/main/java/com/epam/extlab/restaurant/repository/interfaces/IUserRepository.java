package com.epam.extlab.restaurant.repository.interfaces;

import com.epam.extlab.restaurant.entity.dto.User;

import java.util.List;

public interface IUserRepository {
    long addUser(User user);

    List<User> getAllUsers();

    User getUserById(long id);

    void deleteUserById(long id);
}
