package com.example.demo.service;

import com.example.demo.model.Item;

import java.util.List;

public interface ItemService {
    Item createItem(Item item);
    Item getItemById(Long id);
    List<Item> getAllItems();
    Item updateItem(Long id, Item item);
    void deleteItem(Long id);
}
