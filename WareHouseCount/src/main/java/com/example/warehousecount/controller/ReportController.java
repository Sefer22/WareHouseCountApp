package com.example.warehousecount.controller;

import com.example.warehousecount.Dto.StockLevelDto;
import com.example.warehousecount.Service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/stock-levels")
    public ResponseEntity<?> getStockLevelsReport() {
        List<StockLevelDto> stockLevels = reportService.getStockLevels();
        return ResponseEntity.ok(stockLevels);
    }
}
