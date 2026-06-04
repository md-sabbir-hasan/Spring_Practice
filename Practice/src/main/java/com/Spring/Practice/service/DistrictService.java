package com.Spring.Practice.service;

import com.Spring.Practice.dto.response.DistrictResponseDTO;
import com.Spring.Practice.entity.District;

import java.util.List;
import java.util.Optional;

public interface DistrictService {

    District save(District d);
    List<District> findAll();
    Optional<District> getById(Integer id);
    void delete(Integer id);

    List<DistrictResponseDTO> findByDivisionId(Integer  divisionId);

    List<DistrictResponseDTO> findByDivisionName(String divisionName);


}
