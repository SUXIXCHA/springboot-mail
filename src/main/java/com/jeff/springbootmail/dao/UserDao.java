package com.jeff.springbootmail.dao;

import com.jeff.springbootmail.dto.UserRegisterRequest;
import com.jeff.springbootmail.model.User;

public interface UserDao {

    User getUserById(Integer userId);
    Integer createUser(UserRegisterRequest userRegisterRequest);
}
