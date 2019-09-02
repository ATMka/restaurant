package com.epam.extlab.restaurant.service;

import com.epam.extlab.restaurant.entity.dto.OrderPosition;
import com.epam.extlab.restaurant.repository.interfaces.IOrderPositionRepository;
import com.epam.extlab.restaurant.service.interfaces.IOrderPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderPositionService implements IOrderPositionService {
    @Autowired
    private IOrderPositionRepository orderPositionRepository;

    public long addOrderPosition(OrderPosition orderPosition){
        return orderPositionRepository.addOrderPosition(orderPosition);
    }

    @Override
    public List<OrderPosition> getAllOrderPositions(long positionId) {
        return orderPositionRepository.getAllOrderPositions(positionId);
    }

    @Override
    public OrderPosition getOrderPositionById(long positionId){
        return orderPositionRepository.getOrderPositionById(positionId);
    }

    @Override
    public int deleteOrderPositionById(long positionId){
        return orderPositionRepository.deleteOrderPositionById(positionId);
    }
}
