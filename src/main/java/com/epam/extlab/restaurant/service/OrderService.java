package com.epam.extlab.restaurant.service;

import com.epam.extlab.restaurant.entity.dto.Order;
import com.epam.extlab.restaurant.repository.interfaces.IOrderRepository;
import com.epam.extlab.restaurant.service.interfaces.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderService {
    @Autowired
    private IOrderRepository orderRepository;

    public long addOrder(Order order){
        return orderRepository.addOrder(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.getAllOrders();
    }

    @Override
    public Order getOrderById(long orderId){
        return orderRepository.getOrderById(orderId);
    }

    @Override
    public int deleteOrderById(long orderId){
        return orderRepository.deleteOrderById(orderId);
    }
}
