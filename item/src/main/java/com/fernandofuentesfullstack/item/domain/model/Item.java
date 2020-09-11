package com.fernandofuentesfullstack.item.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Item {

    private Product product;
    private Integer quantity;

    public Double getTotal(){
        return product.getPrice() * quantity.doubleValue();
    }

}
