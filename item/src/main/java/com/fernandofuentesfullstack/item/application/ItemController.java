package com.fernandofuentesfullstack.item.application;

import com.fernandofuentesfullstack.item.domain.model.Item;
import com.fernandofuentesfullstack.item.domain.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public List<Item> listAll() {
        return itemService.findAll();
    }

    @GetMapping("{id}/quantity/{quantity}")
    public Item detail(@PathVariable Long id, @PathVariable Integer quantity){
        return itemService.findById(id, quantity);
    }

}
