package com.fernandofuentesfullstack.item.domain.service;

import com.fernandofuentesfullstack.item.domain.model.Item;
import com.fernandofuentesfullstack.item.domain.model.Product;
import com.fernandofuentesfullstack.item.infrastructure.FeignClients.ProductFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service("FeignClient")
public class ItemServiceImplFeign implements ItemService {

    @Autowired
    private ProductFeignClient productFeignClient;

    @Override
    public List<Item> findAll() {
        return productFeignClient.list().stream()
                .map(product -> new Item(product, 1))
                .collect(Collectors.toList());
    }

    @Override
    public Item findById(Long id, Integer quantity) {
        return new Item(productFeignClient.detail(id), quantity);
    }
}
