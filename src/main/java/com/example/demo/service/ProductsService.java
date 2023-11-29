package com.example.demo.service;

import com.example.demo.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductsService {

    Product getProductById(Long id);

    Page<Product> getProducts(Pageable pageable);

    Product addProduct(Product product);

    Product updateProduct(Long id, Product product);

    void deleteProductById(Long id);

}
