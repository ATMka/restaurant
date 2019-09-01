package com.epam.extlab.restaurant.repository;

import com.epam.extlab.restaurant.entity.dto.Item;
import com.epam.extlab.restaurant.repository.interfaces.IItemRepository;
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
public class ItemRepository implements IItemRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private RowMapper<Item> ROW_MAPPER = ((resultSet, rowNumber) -> new Item(
            resultSet.getLong("item_id"),
            resultSet.getLong("category_id"),
            resultSet.getString("name"),
            resultSet.getString("description"),
            resultSet.getDouble("coast"),
            resultSet.getString("image"),
            resultSet.getInt("active"),
            resultSet.getObject("update_time",LocalDateTime.class)));


    @Override
    public long addItem(Item item){
        String sql = "INSERT INTO sitems(category_id, name, description, coast, active, update_time) " +
                    "VALUES(:category_id, :name, :description, :coast, :active, :update_time)";

        GeneratedKeyHolder generatedKeyHolder = new GeneratedKeyHolder();

        MapSqlParameterSource namedParameters = new MapSqlParameterSource();

        namedParameters.addValue("category_id", item.getCategory_id());
        namedParameters.addValue("name", item.getName());
        namedParameters.addValue("description", item.getDescription());
        namedParameters.addValue("coast", item.getCoast());
        namedParameters.addValue("active", item.getActive());
        namedParameters.addValue("update_time", item.getUpdate_time());

        namedParameterJdbcTemplate.update(sql, namedParameters, generatedKeyHolder);
        item.setItem_id(generatedKeyHolder.getKey().longValue());
        return item.getItem_id();
    }

    @Override
    public List<Item> getAllItems() {
        String sql = "SELECT * FROM sitems";
        return jdbcTemplate.query(sql,ROW_MAPPER);
    }

    @Override
    public Item getItemById(long item_id) {
        String sql = "SELECT * FROM sitems WHERE item_id = ?";
        return jdbcTemplate.queryForObject(sql,new Object[]{item_id},ROW_MAPPER);
    }

    @Override
    public int deleteItemById(long item_id) {
        String sql = "DELETE FROM sitems WHERE item_id = ?";
        return jdbcTemplate.update(sql,item_id);
    }
}
