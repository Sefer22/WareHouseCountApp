package com.example.warehousecount.Service;

import com.example.warehousecount.Dto.StockLevelDto;
import com.example.warehousecount.Repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {


    private ReportRepository reportRepository;

    @Override
    public List<StockLevelDto> getStockLevels() {
        // Assuming that your ReportRepository has a method to fetch stock levels
        List<StockLevelDto> stockLevels = reportRepository.findAllStockLevels();

        // You can perform additional logic or transformations if needed

        // Return the result
        return stockLevels;
    }
}

