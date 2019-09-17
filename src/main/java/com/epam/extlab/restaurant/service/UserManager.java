package com.epam.extlab.restaurant.service;

import com.epam.extlab.restaurant.entity.dto.User;
import com.epam.extlab.restaurant.service.interfaces.IUserManager;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@SessionScope
@Service
public class UserManager implements IUserManager {
    private User currentUser;

    @Override
    public User getCurrentUser() {
        return currentUser;
    }

    @Override
    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
}
