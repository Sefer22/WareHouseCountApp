package com.example.warehousecount.Service;

import com.example.warehousecount.Dto.StockLevelDto;

import java.util.List;

public interface ReportService {
    List<StockLevelDto> getStockLevels();
}