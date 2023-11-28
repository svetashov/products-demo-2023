package com.example.demo.repository;

import com.example.demo.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Set;

public interface ProductsRepository extends CrudRepository<Product, Long> {

}
