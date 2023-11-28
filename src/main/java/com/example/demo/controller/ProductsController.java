package com.example.demo.controller;

import com.example.demo.dto.ProductDto;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductsService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductsController {

    private final ProductsService productsService;
    private final ModelMapper modelMapper = new ModelMapper();

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productsService.getProductById(id);
    }

    @GetMapping
    public Iterable<Product> getAllProducts() {
        return productsService.getAllProducts();
    }

    @PostMapping
    public Product addProduct(@RequestBody ProductDto productDto) {
        Product product = modelMapper.map(productDto, Product.class);
        return productsService.addProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
        return productsService.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable Long id) {
        productsService.deleteProductById(id);
    }

}
