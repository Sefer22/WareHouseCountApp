package com.example.warehousecount.Dto;

import com.example.warehousecount.Entity.Item;

// ItemDto.java
public class ItemDto {
    private String name;
    private String barcode;

    public ItemDto(Item item) {
        this.name = item.getName();
        this.barcode = item.getBarcode();

    }

    public ItemDto(String name, String barcode) {
        this.name = name;
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}

