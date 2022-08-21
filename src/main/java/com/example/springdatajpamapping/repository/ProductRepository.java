package com.example.springdatajpamapping.repository;

import com.example.springdatajpamapping.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
