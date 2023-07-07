package com.jeff.springbootmail.service;

import com.jeff.springbootmail.dto.UserRegisterRequest;
import com.jeff.springbootmail.model.User;

public interface UserService {

    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);
}
