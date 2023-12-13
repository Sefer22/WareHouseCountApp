package com.example.warehousecount.Dto;

// StockLevelDto.java
public class StockLevelDto {
    private String itemName;
    private int currentStock;

    public StockLevelDto(String itemName, int currentStock) {
        this.itemName = itemName;
        this.currentStock = currentStock;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(int currentStock) {
        this.currentStock = currentStock;
    }
}

