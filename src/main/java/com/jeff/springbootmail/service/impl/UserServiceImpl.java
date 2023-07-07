package com.jeff.springbootmail.service.impl;

import com.jeff.springbootmail.dao.UserDao;
import com.jeff.springbootmail.dto.UserRegisterRequest;
import com.jeff.springbootmail.model.User;
import com.jeff.springbootmail.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
