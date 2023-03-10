package com.pichincha.bookin.repository;

import com.pichincha.bookin.entity.BillboardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillboardRepository extends JpaRepository<BillboardEntity, Integer> {

}
