package com.pichincha.bookin.service.mapper;


import com.pichincha.bookin.entity.BillboardEntity;
import com.pichincha.bookin.service.dto.BillboardDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BillboardMapper {

    BillboardEntity toBillboardEntity(BillboardDto billboardDto);
    BillboardDto toBillboardDto(BillboardEntity billboardEntity);
}
