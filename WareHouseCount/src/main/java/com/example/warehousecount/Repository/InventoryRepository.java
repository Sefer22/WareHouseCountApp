package com.example.warehousecount.Repository;

import com.example.warehousecount.Entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    // Additional custom queries can be added here
}
