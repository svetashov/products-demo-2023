package com.example.demo.serviceimpl;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductsRepository;
import com.example.demo.service.ProductsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductsServiceImpl implements ProductsService {

    private ProductsRepository productsRepository;

    @Override
    public Product getProductById(Long id) {
        if (id <= 0)
            throw new IllegalArgumentException("Id must be positive number");

        return productsRepository.getProductById(id);
    }

    @Override
    public Product addProduct(Product product) {
        return productsRepository.addProduct(product);
    }
}
