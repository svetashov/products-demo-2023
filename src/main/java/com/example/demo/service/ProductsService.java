package com.example.demo.service;

import com.example.demo.entity.Product;

public interface ProductsService {

    Product getProductById(Long id);

    Product addProduct(Product product);
}
