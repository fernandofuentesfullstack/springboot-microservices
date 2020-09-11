package com.fernandofuentesfullstack.item.domain.service;

import com.fernandofuentesfullstack.item.domain.model.Item;
import com.fernandofuentesfullstack.item.domain.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service("RestTemplate")
public class ItemServiceImplRestTemplate implements ItemService {

    @Autowired
    private RestTemplate restClient;

    @Override
    public List<Item> findAll() {
        List<Product> products = Arrays.asList(
                restClient.getForObject("http://localhost:8001/products", Product[].class));
        return products.stream()
                .map(product -> new Item(product, 1))
                .collect(Collectors.toList());
    }

    @Override
    public Item findById(Long id, Integer quantity) {
        Map<String, String> pathVariable = new HashMap<String, String>();
        pathVariable.put("id", id.toString());
        Product product = restClient.getForObject("http://localhost:8001/products/{id}", Product.class, pathVariable);
        return new Item(product, quantity);
    }
}
