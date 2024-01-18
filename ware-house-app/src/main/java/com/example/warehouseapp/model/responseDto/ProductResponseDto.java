package com.example.warehouseapp.model.responseDto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductResponseDto {
    Long id;
    String name;
    float salesPrice;
    float purchasePrice;
    long  productCount;
    String qrCode;
    Long categoryId;
}
