package com.Spring.Practice.repository;

import com.Spring.Practice.entity.PoliceStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PoliceStationRepository extends JpaRepository<PoliceStation, Long> {

    List<PoliceStation> findByDistrictId(Integer districtId);

    List<PoliceStation> findByDistrictName(String districtName);
}