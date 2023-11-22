package com.example.demo.repositoryimpl;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductsRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ProductsRepositoryImpl implements ProductsRepository {

    @Override
    public Product getProductById(Long id) {
        return new Product(1L, "Product1", "Desc", 15.99);
    }

    @Override
    public Product addProduct(Product product) {
        product.setPrice(product.getPrice() + 10);
        return product;
    }

}
