package com.jeff.springbootmail.service;

import com.jeff.springbootmail.constant.ProductCategory;
import com.jeff.springbootmail.dto.ProductRequest;
import com.jeff.springbootmail.model.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductService  {

    List<Product> getProducts(ProductCategory category,String search);
    Product getProductById(Integer productId );

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
