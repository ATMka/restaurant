package com.epam.extlab.restaurant.service.interfaces;

import com.epam.extlab.restaurant.entity.dto.User;

public interface IUserManager {
    User getCurrentUser();

    void setCurrentUser(User currentUser);
}
