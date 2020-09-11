package com.fernandofuentesfullstack.item.infrastructure.FeignClients;

import com.fernandofuentesfullstack.item.domain.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "product", url = "localhost:8001")
public interface ProductFeignClient {

    @GetMapping("/products")
    public List<Product> list();

    @GetMapping("/products/{id}")
    public Product detail(@PathVariable(name = "id") Long id);

}
