package com.example.demo.repository;

import com.example.demo.entity.Product;

public interface ProductsRepository {

    Product getProductById(Long id);

    Product addProduct(Product product);
}
