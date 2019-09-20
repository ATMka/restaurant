package com.epam.extlab.restaurant.service;

import com.epam.extlab.restaurant.entity.dto.User;
import com.epam.extlab.restaurant.exception.AuthorizationException;
import com.epam.extlab.restaurant.repository.interfaces.IUserRepository;
import com.epam.extlab.restaurant.service.interfaces.IUserManager;
import com.epam.extlab.restaurant.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IUserManager userManager;

    @Override
    public long addUser (User user){
        return userRepository.addUser(user);
    }

    @Override
    public User addUserLoginPassword(User user) {
        return userRepository.addUserLoginPassword(user);
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

    @Override
    public Optional<User> findUserByLogin(String login) {
        Assert.notNull(login, "login не может быть равен null");
        return getAllUsers().stream().filter(user -> user.getLogin().equalsIgnoreCase(login)).findFirst();
    }

    @Override
    public boolean authorize(User authorizingUser) {
        Optional<User> userOpt = findUserByLogin(authorizingUser.getLogin());

        User user = userOpt.orElseThrow(() -> new AuthorizationException("Такой пользователь не найден"));

        if (!user.getPassword().equalsIgnoreCase(authorizingUser.getPassword())) {
            throw new AuthorizationException("Неверный пароль");
        }

        userManager.setCurrentUser(user);

        return true;
    }
}
