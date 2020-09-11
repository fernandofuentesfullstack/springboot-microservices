package com.fernandofuentesfullstack.product.domain.model;

import com.fernandofuentesfullstack.product.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
