package com.jeff.springbootmail.service;

import com.jeff.springbootmail.dto.ProductRequest;
import com.jeff.springbootmail.model.Product;
import org.springframework.stereotype.Component;

@Component
public interface ProductService  {
    Product getProductById(Integer productId );

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);

}
