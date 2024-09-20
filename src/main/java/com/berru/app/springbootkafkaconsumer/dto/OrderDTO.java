package com.berru.app.springbootkafkaconsumer.dto;

import com.berru.app.springbootkafkaconsumer.enums.OrderStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;


@Data
public class OrderDTO {

    private Integer id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime orderDate;
    private OrderStatus orderStatus;
    private BigDecimal totalAmount;
    private Integer customerId;
    private AddressDTO address;
    private List<OrderItemDTO> orderItems = new ArrayList<>();

}
