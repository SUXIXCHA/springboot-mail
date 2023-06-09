package com.jeff.springbootmail.service.impl;

import com.jeff.springbootmail.constant.ProductCategory;
import com.jeff.springbootmail.dao.ProductDao;
import com.jeff.springbootmail.dto.ProductQueryParams;
import com.jeff.springbootmail.dto.ProductRequest;
import com.jeff.springbootmail.model.Product;
import com.jeff.springbootmail.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {
   @Autowired
   private ProductDao productDao;

    @Override
    public Integer countProduct(ProductQueryParams productQueryParams) {
        return productDao.countProduct(productQueryParams);
    }

    @Override
    public List<Product> getProducts(ProductQueryParams productQueryParams) {
        return productDao.getProducts(productQueryParams);
    }

    @Override
    public Product getProductById(Integer productId) {

        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }

    @Override
    public void updateProduct(Integer productId, ProductRequest productRequest) {
         productDao.updateProduct(productId,productRequest);

    }

    @Override
    public void deleteProductById(Integer productId) {
        productDao.deleteProductById(productId);
    }
}
