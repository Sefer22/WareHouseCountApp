package com.example.warehousecount.Service;

import com.example.warehousecount.Dto.InventoryCountDto;

public interface InventoryService {
    void updateInventory(InventoryCountDto countDto);
}
