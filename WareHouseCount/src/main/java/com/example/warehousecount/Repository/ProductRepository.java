package com.example.warehousecount.Repository;

import com.example.warehousecount.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Additional custom queries can be added here
}