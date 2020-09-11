package com.fernandofuentesfullstack.product.domain.service;

import com.fernandofuentesfullstack.product.domain.model.Product;

import java.util.List;

public interface ProductService {

    public List<Product> findAll();

    public Product findById(Long id);
}
