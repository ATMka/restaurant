package com.epam.extlab.restaurant.repository.interfaces;

import com.epam.extlab.restaurant.entity.dto.Item;

import java.util.List;

public interface IItemRepository {
    long addItem(Item item);

    List<Item> getAllItems();

    Item getItemById(long id);

    int deleteItemById(long id);
}
