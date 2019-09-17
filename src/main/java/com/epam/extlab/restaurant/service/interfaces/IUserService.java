package com.epam.extlab.restaurant.service.interfaces;

import com.epam.extlab.restaurant.entity.dto.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    long addUser(User user);

    List<User> getAllUsers();

    User getUserById(long id);

    int deleteUserById(long id);

    Optional<User> findUserByLogin(String login);

    boolean authorize(User authorizedUser);
}
