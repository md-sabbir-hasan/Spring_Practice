package com.Spring.Practice.service;

import com.Spring.Practice.entity.Country;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CountryService {

    Country save(Country c);
    List<Country> findAll();
    Optional<Country> getById(Integer id);
    void delete(Integer id);
}
