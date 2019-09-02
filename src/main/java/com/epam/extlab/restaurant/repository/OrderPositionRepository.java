package com.epam.extlab.restaurant.repository;

import com.epam.extlab.restaurant.entity.dto.OrderPosition;
import com.epam.extlab.restaurant.repository.interfaces.IOrderPositionRepository;
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
public class OrderPositionRepository implements IOrderPositionRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private RowMapper<OrderPosition> ROW_MAPPER = ((resultSet, rowNumber) -> new OrderPosition(
            resultSet.getLong("position_id"),
            resultSet.getLong("order_id"),
            resultSet.getLong("item_id"),
            resultSet.getDouble("coast"),
            resultSet.getInt("active"),
            resultSet.getObject("update_time",LocalDateTime.class)));


    public long addOrderPosition(OrderPosition orderPosition){
        String sql = "INSERT INTO rorder_position(order_id, item_id, coast, active, update_time) " +
                    "VALUES(:order_id, :item_id, :coast, :active, :update_time)";

        GeneratedKeyHolder generatedKeyHolder = new GeneratedKeyHolder();

        MapSqlParameterSource namedParameters = new MapSqlParameterSource();

        namedParameters.addValue("order_id", orderPosition.getOrderId());
        namedParameters.addValue("item_id", orderPosition.getItemId());
        namedParameters.addValue("coast", orderPosition.getCoast());
        namedParameters.addValue("active", orderPosition.getActive());
        namedParameters.addValue("update_time", orderPosition.getUpdateTime());

        namedParameterJdbcTemplate.update(sql, namedParameters, generatedKeyHolder);
        orderPosition.setPositionId(generatedKeyHolder.getKey().longValue());

        return orderPosition.getOrderId();
    }

    @Override
    public List<OrderPosition> getAllOrderPositions(long orderId) {
        String sql = "SELECT * FROM rorder_position WHERE order_id = ?";
        return jdbcTemplate.query(sql,new Object[]{orderId},ROW_MAPPER);
    }

    @Override
    public OrderPosition getOrderPositionById(long positionId) {
        String sql = "SELECT * FROM rorder_position WHERE order_id = ?";
        return jdbcTemplate.queryForObject(sql,new Object[]{positionId},ROW_MAPPER);
    }

    @Override
    public int deleteOrderPositionById(long positionId) {
        String sql = "DELETE FROM rorder_position WHERE position_id = ?";
        return jdbcTemplate.update(sql,positionId);
    }
}
