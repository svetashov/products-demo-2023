package com.example.demo.repository;

import com.example.demo.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Set;

public interface ProductsRepository extends PagingAndSortingRepository<Product, Long>, CrudRepository<Product, Long> {

}
