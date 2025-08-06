package com.example.marketplace.dto;

import com.example.marketplace.model.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private Long id;
    private String customerName;
    private List<OrderItemDto> orderItems;
    private OrderStatus status;
    private BigDecimal totalAmount;
    private Date createdAt;
}
