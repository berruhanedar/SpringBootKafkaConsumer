package com.berru.app.springbootkafkaconsumer.dto;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemDTO {

    private Integer orderItemId;
    private ProductDTO product;
    private Integer quantity;
    private BigDecimal price;

}
