package com.example.warehousecount.controller;

import com.example.warehousecount.Dto.ItemDto;
import com.example.warehousecount.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ItemController {


    private ItemService itemService;

    @PostMapping("items/scan")
    public ResponseEntity<?> scanBarcode(@RequestParam String barcode) {
        ItemDto item = itemService.scanBarcode(barcode);
        return ResponseEntity.ok(item);
    }
}

