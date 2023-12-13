package com.example.warehousecount.Repository;

import com.example.warehousecount.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ItemRepository extends JpaRepository<Item, Long> {
    Optional<Item> findByBarcode(String barcode);
}