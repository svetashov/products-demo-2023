package com.example.demo.service.impl;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductsRepository;
import com.example.demo.service.ProductsService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional
public class ProductsServiceImpl implements ProductsService {

    private ProductsRepository productsRepository;

    @Override
    public Product getProductById(Long id) {
        return productsRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("There is no product with id=" + id));
    }

    @Override
    public Page<Product> getProducts(Pageable pageable) {
        return productsRepository.findAll(pageable);
    }

    @Override
    public Product addProduct(Product product) {
        return productsRepository.save(product);
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        if (!id.equals(product.getId())) {
            throw new RuntimeException("Id`s should be equaled.");
        }
        if (!productsRepository.existsById(id)) {
            throw new RuntimeException("Product with id=" + id + " must be created.");
        }
        return productsRepository.save(product);
    }

    @Override
    public void deleteProductById(Long id) {
        if (!productsRepository.existsById(id)) {
            throw new RuntimeException("Product with id=" + id + " cannot be deleted.");
        }
        productsRepository.deleteById(id);
    }

}
