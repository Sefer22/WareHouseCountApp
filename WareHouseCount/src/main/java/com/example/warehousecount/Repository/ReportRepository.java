package com.example.warehousecount.Repository;

import com.example.warehousecount.Dto.StockLevelDto;
import com.example.warehousecount.Entity.StockLevel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReportRepository extends JpaRepository<StockLevel, Long> {
    List<StockLevelDto> findAllStockLevels();
}
