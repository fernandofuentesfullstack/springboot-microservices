package com.fernandofuentesfullstack.item.domain.service;

import com.fernandofuentesfullstack.item.domain.model.Item;

import java.util.List;

public interface ItemService {

    public List<Item> findAll();

    public Item findById(Long id, Integer quantity);
}
