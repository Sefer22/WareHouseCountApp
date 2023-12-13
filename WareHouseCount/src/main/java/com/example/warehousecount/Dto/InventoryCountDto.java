package com.example.warehousecount.Dto;

// InventoryCountDto.java
public class InventoryCountDto {
    private String barcode;
    private int count;

    public InventoryCountDto(String barcode, int count) {
        this.barcode = barcode;
        this.count = count;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
