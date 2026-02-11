package com.example.product.service;

import com.example.product.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product findById(Long id);

    Product create(Product product);

    Product update(Long id, Product updatedProduct);

    void delete(Long id);
}
