package com.jeff.springbootmail.dao;

import com.jeff.springbootmail.dto.ProductRequest;
import com.jeff.springbootmail.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId );
    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);

    void deleteProductById(Integer productId);


}
