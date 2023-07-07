package com.jeff.springbootmail.rowmapper;

import com.jeff.springbootmail.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {

    @Override
    public  User mapRow(ResultSet resultSet, int i)throws SQLException{
        User user = new User();
        user.setUserId(resultSet.getInt("user_id"));
        user.setEmail(resultSet.getString("email"));
        user.setPassword(resultSet.getString("password"));
        user.setCreatedDate(resultSet.getTimestamp("created_date"));
        user.setLateModifiedDate(resultSet.getTimestamp("last_modified_date"));

        return  user;

    }

}
