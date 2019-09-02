package com.epam.extlab.restaurant.service;

import com.epam.extlab.restaurant.entity.dto.Item;
import com.epam.extlab.restaurant.repository.interfaces.IItemRepository;
import com.epam.extlab.restaurant.service.interfaces.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService implements IItemService {
    @Autowired
    private IItemRepository itemRepository;

    public long addItem(Item item){
        return itemRepository.addItem(item);
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.getAllItems();
    }

    @Override
    public Item getItemById(long itemId){
        return itemRepository.getItemById(itemId);
    }

    @Override
    public void deleteItemById(long itemId){
        itemRepository.deleteItemById(itemId);
    }
}
