package com.berru.app.springbootkafkaconsumer.dto;


import com.berru.app.springbootkafkaconsumer.enums.ProductStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductDTO {

    private Integer id;
    private String name;
    private BigDecimal price;
    private String description;
    private Integer quantity;
    private String image;
    private Integer categoryId;
    private ProductStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<CategoryDTO> categoryTree;


}