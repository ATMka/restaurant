package com.epam.extlab.restaurant.service.interfaces;

import com.epam.extlab.restaurant.entity.dto.Item;
import com.epam.extlab.restaurant.entity.dto.User;

import java.util.List;

public interface IItemService {
    long addItem(Item item);

    List<Item> getAllItems();

    Item getItemById(long id);

    void deleteItemById(long id);
}
