package com.example.warehouseapp.mapper;

import com.example.warehouseapp.dao.entity.CategoryEntity;
import com.example.warehouseapp.model.requestDto.CategoryRequestDto;
import com.example.warehouseapp.model.responseDto.CategoryResponseDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-18T02:27:18+0400",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 18.0.1.1 (Oracle Corporation)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryEntity dtoToEntity(CategoryRequestDto categoryRequestDto) {
        if ( categoryRequestDto == null ) {
            return null;
        }

        CategoryEntity.CategoryEntityBuilder categoryEntity = CategoryEntity.builder();

        categoryEntity.name( categoryRequestDto.getName() );

        return categoryEntity.build();
    }

    @Override
    public List<CategoryEntity> dtoToEntities(List<CategoryRequestDto> categoryRequestDtoList) {
        if ( categoryRequestDtoList == null ) {
            return null;
        }

        List<CategoryEntity> list = new ArrayList<CategoryEntity>( categoryRequestDtoList.size() );
        for ( CategoryRequestDto categoryRequestDto : categoryRequestDtoList ) {
            list.add( dtoToEntity( categoryRequestDto ) );
        }

        return list;
    }

    @Override
    public CategoryResponseDto entityToDto(CategoryEntity categoryEntity) {
        if ( categoryEntity == null ) {
            return null;
        }

        CategoryResponseDto.CategoryResponseDtoBuilder categoryResponseDto = CategoryResponseDto.builder();

        categoryResponseDto.id( categoryEntity.getId() );
        categoryResponseDto.name( categoryEntity.getName() );

        return categoryResponseDto.build();
    }

    @Override
    public List<CategoryResponseDto> entityToDtos(List<CategoryEntity> reservationEntities) {
        if ( reservationEntities == null ) {
            return null;
        }

        List<CategoryResponseDto> list = new ArrayList<CategoryResponseDto>( reservationEntities.size() );
        for ( CategoryEntity categoryEntity : reservationEntities ) {
            list.add( entityToDto( categoryEntity ) );
        }

        return list;
    }
}
