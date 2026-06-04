package com.Spring.Practice.service;


import com.Spring.Practice.dto.response.PoliceStationResponseDTO;
import com.Spring.Practice.entity.PoliceStation;

import java.util.List;
import java.util.Optional;

public interface PoliceStationService {

    PoliceStation save(PoliceStation p);
    List<PoliceStation> findAll();
    Optional<PoliceStation> getById(Long id);
    void delete(Long id);

    List<PoliceStationResponseDTO> findByDistrictId(Integer  districtId);

    List<PoliceStationResponseDTO> findByDistrictName(String districtName);


}
