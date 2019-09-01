package com.epam.extlab.restaurant.repository;

import com.epam.extlab.restaurant.entity.dto.User;
import com.epam.extlab.restaurant.repository.interfaces.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public class UserRepository implements IUserRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private RowMapper<User> ROW_MAPPER = ((resultSet, rowNumber) -> new User(
            resultSet.getLong("user_id"),
            resultSet.getInt("active"),
            resultSet.getString("fullname"),
            resultSet.getString("login"),
            resultSet.getString("password"),
            resultSet.getBoolean("is_admin"),
            resultSet.getObject("update_time",LocalDateTime.class)));


    @Override
    public long addUser(User user){
        String sql = "INSERT INTO susers(active, fullname, login, password, update_time, is_admin) " +
                    "VALUES(:active, :fullname, :login, :password, :update_time, :is_admin)";

        GeneratedKeyHolder generatedKeyHolder = new GeneratedKeyHolder();

        MapSqlParameterSource namedParameters = new MapSqlParameterSource();

        namedParameters.addValue("active", user.getActive());
        namedParameters.addValue("fullname", user.getFullname());
        namedParameters.addValue("login", user.getLogin());
        namedParameters.addValue("password", user.getPassword());
        namedParameters.addValue("update_time", user.getUpdate_time());
        namedParameters.addValue("is_admin", user.isIs_admin());

        namedParameterJdbcTemplate.update(sql, namedParameters, generatedKeyHolder);
        user.setUser_id(generatedKeyHolder.getKey().longValue());

        return user.getUser_id();
    }

    @Override
    public List<User> getAllUsers() {
        String sql = "SELECT * FROM susers";
        return jdbcTemplate.query(sql,ROW_MAPPER);
    }

    @Override
    public User getUserById(long user_id) {
        String sql = "SELECT * FROM susers WHERE user_id = ?";
        return jdbcTemplate.queryForObject(sql,new Object[]{user_id},ROW_MAPPER);
    }

    @Override
    public int deleteUserById(long user_id) {
        String sql = "DELETE FROM susers WHERE user_id = ?";
        return jdbcTemplate.update(sql,user_id);
    }
}
