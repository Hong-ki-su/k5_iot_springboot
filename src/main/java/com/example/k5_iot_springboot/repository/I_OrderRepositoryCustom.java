package com.example.k5_iot_springboot.repository;

import com.example.k5_iot_springboot.common.enums.OrderStatus;
import com.example.k5_iot_springboot.entity.I_Order;

import java.time.LocalDateTime;
import java.util.List;

public interface I_OrderRepositoryCustom {

    List<I_Order> searchOrders(Long userId, OrderStatus status, LocalDateTime from, LocalDateTime to);
}
