package com.epam.extlab.restaurant.repository.interfaces;

import com.epam.extlab.restaurant.entity.dto.OrderPosition;

import java.util.List;

public interface IOrderPositionRepository {
    long addOrderPosition(OrderPosition orderPosition);

    List<OrderPosition> getAllOrderPositions(long orderId);

    OrderPosition getOrderPositionById(long id);

    int deleteOrderPositionById(long id);
}
