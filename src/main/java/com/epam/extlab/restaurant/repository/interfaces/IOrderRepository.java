package com.epam.extlab.restaurant.repository.interfaces;

import com.epam.extlab.restaurant.entity.dto.Order;

import java.util.List;

public interface IOrderRepository {
    long addOrder(Order Order);

    List<Order> getAllOrders();

    Order getOrderById(long id);

    int deleteOrderById(long id);
}
