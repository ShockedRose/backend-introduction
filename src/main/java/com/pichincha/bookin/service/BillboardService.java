package com.pichincha.bookin.service;

import com.pichincha.bookin.entity.BillboardEntity;
import com.pichincha.bookin.service.dto.BillboardDto;

import java.util.List;

public interface BillboardService {
    List<BillboardDto> getAllBillboard();

    BillboardDto getBillboardById(Integer id);

    BillboardDto createBillboard(BillboardDto billboardDto);

    BillboardDto updateBillboard(Integer id, BillboardDto billboardDto);

    void deleteBillboard(Integer id);
}