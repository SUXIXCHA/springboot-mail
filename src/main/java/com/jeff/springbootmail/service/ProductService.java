package com.jeff.springbootmail.service;

import com.jeff.springbootmail.model.Product;
import org.springframework.stereotype.Component;

@Component
public interface ProductService  {
    Product getProductById(Integer productId );
}
