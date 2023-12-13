package com.example.warehousecount.Service;

import com.example.warehousecount.Dto.ItemDto;
import com.example.warehousecount.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {


    private ItemRepository itemRepository;

    @Override
    public ItemDto scanBarcode(String barcode) {
        // Implement barcode scanning logic, retrieve item details from the database
        return itemRepository.findByBarcode(barcode)
                .map(ItemDto::new)
                .orElseThrow(() -> new RuntimeException("Item not found"));
    }
}
