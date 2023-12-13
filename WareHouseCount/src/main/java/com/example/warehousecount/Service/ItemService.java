package com.example.warehousecount.Service;

import com.example.warehousecount.Dto.ItemDto;

public interface ItemService {
    ItemDto scanBarcode(String barcode);
}