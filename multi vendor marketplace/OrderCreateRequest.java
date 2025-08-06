package com.example.marketplace.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.util.List;

@Data
public class OrderCreateRequest {
    @NotEmpty
    @Valid
    private List<OrderItemRequest> orderItems;
}
