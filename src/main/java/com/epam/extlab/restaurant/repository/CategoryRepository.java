package com.epam.extlab.restaurant.repository;

import com.epam.extlab.restaurant.entity.dto.Category;
import com.epam.extlab.restaurant.entity.dto.User;
import com.epam.extlab.restaurant.repository.interfaces.ICategoryRepository;
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
public class CategoryRepository implements ICategoryRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private RowMapper<Category> ROW_MAPPER = ((resultSet, rowNumber) -> new Category(
            resultSet.getLong("category_id"),
            resultSet.getObject("parent_id",Long.class),
            resultSet.getString("name"),
            resultSet.getString("description"),
            resultSet.getInt("active"),
            resultSet.getObject("update_time",LocalDateTime.class)));


    @Override
    public long addCategory(Category category){
        String sql = "INSERT INTO scategory(parent_id, name, description, active, update_time) " +
                    "VALUES(:parent_id, :name, :description, :active, :update_time)";

        GeneratedKeyHolder generatedKeyHolder = new GeneratedKeyHolder();

        MapSqlParameterSource namedParameters = new MapSqlParameterSource();

        namedParameters.addValue("parent_id", category.getParentId());
        namedParameters.addValue("name", category.getName());
        namedParameters.addValue("description", category.getDescription());
        namedParameters.addValue("active", category.getActive());
        namedParameters.addValue("update_time", category.getUpdateTime());

        namedParameterJdbcTemplate.update(sql, namedParameters, generatedKeyHolder);
        category.setCategoryId(generatedKeyHolder.getKey().longValue());

        return category.getCategoryId();
    }

    @Override
    public List<Category> getAllCategories() {
        String sql = "SELECT * FROM scategory";
        return jdbcTemplate.query(sql,ROW_MAPPER);
    }

    @Override
    public Category getCategoryById(long categoryId) {
        String sql = "SELECT * FROM scategory WHERE category_id = ?";
        return jdbcTemplate.queryForObject(sql,new Object[]{categoryId},ROW_MAPPER);
    }

    @Override
    public int deleteCategoryById(long categoryId) {
        String sql = "DELETE FROM scategory WHERE category_id = ?";
        return jdbcTemplate.update(sql,categoryId);
    }

    public String isNullStringForSqlQuery(Object object){
        if(object.equals(null)){
            return "IS NULL";
        }
        return "=";
    }
}
