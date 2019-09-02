package com.epam.extlab.restaurant.service.interfaces;

import com.epam.extlab.restaurant.entity.dto.Order;

import java.util.List;

public interface IOrderService {
    long addOrder(Order order);

    List<Order> getAllOrders();

    Order getOrderById(long id);

    int deleteOrderById(long id);
}
