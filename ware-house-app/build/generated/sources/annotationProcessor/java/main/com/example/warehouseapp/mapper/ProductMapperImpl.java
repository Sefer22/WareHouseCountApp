package com.example.warehouseapp.mapper;

import com.example.warehouseapp.dao.entity.ProductEntity;
import com.example.warehouseapp.model.requestDto.ProductRequestDto;
import com.example.warehouseapp.model.responseDto.ProductResponseDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-18T02:27:19+0400",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 18.0.1.1 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductEntity dtoToEntity(ProductRequestDto productRequestDto) {
        if ( productRequestDto == null ) {
            return null;
        }

        ProductEntity.ProductEntityBuilder productEntity = ProductEntity.builder();

        productEntity.name( productRequestDto.getName() );
        productEntity.salesPrice( productRequestDto.getSalesPrice() );
        productEntity.purchasePrice( productRequestDto.getPurchasePrice() );
        productEntity.productCount( productRequestDto.getProductCount() );

        return productEntity.build();
    }

    @Override
    public List<ProductEntity> dtoToEntities(List<ProductRequestDto> productRequestDtoList) {
        if ( productRequestDtoList == null ) {
            return null;
        }

        List<ProductEntity> list = new ArrayList<ProductEntity>( productRequestDtoList.size() );
        for ( ProductRequestDto productRequestDto : productRequestDtoList ) {
            list.add( dtoToEntity( productRequestDto ) );
        }

        return list;
    }

    @Override
    public ProductResponseDto entityToDto(ProductEntity productEntity) {
        if ( productEntity == null ) {
            return null;
        }

        ProductResponseDto.ProductResponseDtoBuilder productResponseDto = ProductResponseDto.builder();

        productResponseDto.id( productEntity.getId() );
        productResponseDto.name( productEntity.getName() );
        productResponseDto.salesPrice( productEntity.getSalesPrice() );
        productResponseDto.purchasePrice( productEntity.getPurchasePrice() );
        productResponseDto.productCount( productEntity.getProductCount() );
        productResponseDto.qrCode( productEntity.getQrCode() );

        return productResponseDto.build();
    }

    @Override
    public List<ProductResponseDto> entityToDtos(List<ProductEntity> reservationEntities) {
        if ( reservationEntities == null ) {
            return null;
        }

        List<ProductResponseDto> list = new ArrayList<ProductResponseDto>( reservationEntities.size() );
        for ( ProductEntity productEntity : reservationEntities ) {
            list.add( entityToDto( productEntity ) );
        }

        return list;
    }
}
