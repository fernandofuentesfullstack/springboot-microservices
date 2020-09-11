package com.fernandofuentesfullstack.item.domain.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter @Setter @NoArgsConstructor
public class Product {

    private Long id;
    private String name;
    private Double price;
    private Date createAt;

}
