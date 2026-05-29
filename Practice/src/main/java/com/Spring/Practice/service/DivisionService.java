package com.Spring.Practice.service;
import com.Spring.Practice.dto.DivisionDTO;

import com.Spring.Practice.entity.Division;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DivisionService {
    Division save(Division d);
    List<Division> findAll();
    Optional<Division> getById(Integer id);
    void delete(Integer id);

    List<DivisionDTO> getDivisionsByCountryId(Integer countryId);

    List<DivisionDTO> getDivisionsByCountryName(String countryName);

}
