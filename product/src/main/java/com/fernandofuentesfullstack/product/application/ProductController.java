package com.fernandofuentesfullstack.product.application;

import com.fernandofuentesfullstack.product.domain.model.Product;
import com.fernandofuentesfullstack.product.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> listAll() {
        return productService.findAll();
    }

    @GetMapping("{id}")
    public Product detail(@PathVariable(name = "id") Long id) {
        return productService.findById(id);
    }
}
