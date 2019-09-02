package com.epam.extlab.restaurant.service.interfaces;

import com.epam.extlab.restaurant.entity.dto.OrderPosition;

import java.util.List;

public interface IOrderPositionService {
    long addOrderPosition(OrderPosition orderPosition);

    List<OrderPosition> getAllOrderPositions(long id);

    OrderPosition getOrderPositionById(long id);

    int deleteOrderPositionById(long id);
}
