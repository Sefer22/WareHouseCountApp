package com.example.warehousecount.controller;

import com.example.warehousecount.Dto.InventoryCountDto;
import com.example.warehousecount.Service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class InventoryController {


    private InventoryService inventoryService;

    @PostMapping("inventory/count")
    public ResponseEntity<?> conductInventoryCount(@RequestBody InventoryCountDto countDto) {
        inventoryService.updateInventory(countDto);
        return ResponseEntity.ok("Inventory count updated successfully");
    }
}
