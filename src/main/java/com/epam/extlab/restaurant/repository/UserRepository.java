package com.epam.extlab.restaurant.repository;

import com.epam.extlab.restaurant.entity.dto.User;
import com.epam.extlab.restaurant.repository.interfaces.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public class UserRepository implements IUserRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private RowMapper<User> ROW_MAPPER = ((resultSet, rowNumber) -> new User(
            resultSet.getLong("user_id"),
            resultSet.getInt("active"),
            resultSet.getString("fullname"),
            resultSet.getString("login"),
            resultSet.getString("password"),
            resultSet.getBoolean("is_admin"),
            resultSet.getObject("update_time",LocalDateTime.class)));


    @Override
    public void addUser(User user){
        try {
            String sql = "INSERT INTO susers(user_id, active, fullname, login, password, update_time, is_admin) " +
                    "VALUES(DEFAULT,?,?,?,?,?,?);";
            jdbcTemplate.update(sql, user.getUser_id(), user.getActive(), user.getFullname(), user.getLogin(),
                    user.getPassword(), user.getUpdate_time(), user.isIs_admin());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
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
    public void deleteUserById(long user_id) {
        String sql = "DELETE FROM susers WHERE user_id = ?";
        jdbcTemplate.update(sql,user_id);
    }
}