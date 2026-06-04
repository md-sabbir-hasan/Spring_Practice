package com.Spring.Practice.repository;

import com.Spring.Practice.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistrictRepository extends JpaRepository<District, Integer> {
    List<District> findByDivisionId(Integer divisionId);

    List<District> findByDivisionName(String divisionName);

}
