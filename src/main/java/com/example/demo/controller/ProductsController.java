package com.example.demo.controller;

import com.example.demo.dto.ProductDto;
import com.example.demo.entity.Product;
import com.example.demo.mapper.ProductsMapper;
import com.example.demo.service.ProductsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/products")
// CRUD - Create, Read, Update, Delete
public class ProductsController {

    private ProductsService productsService;

    @GetMapping("/{id}")
    public ProductDto getProductById(@PathVariable Long id) {
        Product product = productsService.getProductById(id);
        return ProductsMapper.mapToDto(product);
    }

    @PostMapping
    public ProductDto getProductById(@RequestBody ProductDto productDto) {
        Product product = ProductsMapper.mapToEntity(productDto);
        product = productsService.addProduct(product);
        return ProductsMapper.mapToDto(product);
    }

}
