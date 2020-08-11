package com.company.bicycleshop.service;

import com.company.bicycleshop.entity.Order;

import java.math.BigDecimal;
import java.util.UUID;

public interface OrderService {
    String NAME = "bicycleshop_OrderService";

    BigDecimal calculateAmount(Order order);
    BigDecimal calculateAmount(UUID orderId);
}