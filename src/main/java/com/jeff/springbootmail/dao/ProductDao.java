package com.jeff.springbootmail.dao;

import com.jeff.springbootmail.constant.ProductCategory;
import com.jeff.springbootmail.dto.ProductQueryParams;
import com.jeff.springbootmail.dto.ProductRequest;
import com.jeff.springbootmail.model.Product;

import java.util.List;

public interface ProductDao {

    Integer countProduct(ProductQueryParams productQueryParams);
    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId );
    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);

    void deleteProductById(Integer productId);


}
