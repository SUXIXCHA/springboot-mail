package com.jeff.springbootmail.service.impl;

import com.jeff.springbootmail.dao.ProductDao;
import com.jeff.springbootmail.model.Product;
import com.jeff.springbootmail.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
@Autowired
   private ProductDao productDao;
    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
}}