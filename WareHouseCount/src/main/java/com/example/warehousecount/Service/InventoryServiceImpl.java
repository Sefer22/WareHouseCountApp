package com.example.warehousecount.Service;

import com.example.warehousecount.Dto.InventoryCountDto;
import com.example.warehousecount.Repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryServiceImpl implements InventoryService {


    private InventoryRepository inventoryRepository;

    @Override
    public void updateInventory(InventoryCountDto countDto) {
        // Implement inventory count update logic, update stock levels in the database
    }
}