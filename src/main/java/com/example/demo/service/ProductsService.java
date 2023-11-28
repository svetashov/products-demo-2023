package com.example.demo.service;

import com.example.demo.entity.Product;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProductsService {

    Product getProductById(Long id);

    Iterable<Product> getAllProducts();

    Product addProduct(Product product);

    Product updateProduct(Long id, Product product);

    void deleteProductById(Long id);

}
