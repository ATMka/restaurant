package com.epam.extlab.restaurant.repository;

import com.epam.extlab.restaurant.entity.dto.Order;
import com.epam.extlab.restaurant.repository.interfaces.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public class OrderRepository implements IOrderRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private RowMapper<Order> ROW_MAPPER = ((resultSet, rowNumber) -> new Order(
            resultSet.getLong("order_id"),
            resultSet.getLong("user_id"),
            resultSet.getLong("order_number"),
            resultSet.getInt("active"),
            resultSet.getObject("update_time",LocalDateTime.class)));


    @Override
    public long addOrder(Order order){
        String sql = "INSERT INTO rorders(user_id, order_number, active, update_time) " +
                    "VALUES(:user_id, :order_number, :active, :update_time)";

        GeneratedKeyHolder generatedKeyHolder = new GeneratedKeyHolder();

        MapSqlParameterSource namedParameters = new MapSqlParameterSource();

        namedParameters.addValue("user_id", order.getUserId());
        namedParameters.addValue("order_number", order.getOrderNumber());
        namedParameters.addValue("active", order.getActive());
        namedParameters.addValue("update_time", order.getUpdateTime());

        namedParameterJdbcTemplate.update(sql, namedParameters, generatedKeyHolder);
        order.setOrderId(generatedKeyHolder.getKey().longValue());

        return order.getOrderId();
    }

    @Override
    public List<Order> getAllOrders() {
        String sql = "SELECT * FROM rorders";
        return jdbcTemplate.query(sql,ROW_MAPPER);
    }

    @Override
    public Order getOrderById(long orderId) {
        String sql = "SELECT * FROM rorders WHERE order_id = ?";
        return jdbcTemplate.queryForObject(sql,new Object[]{orderId},ROW_MAPPER);
    }

    @Override
    public int deleteOrderById(long orderId) {
        String sql = "DELETE FROM rorders WHERE order_id = ?";
        return jdbcTemplate.update(sql,orderId);
    }
}
