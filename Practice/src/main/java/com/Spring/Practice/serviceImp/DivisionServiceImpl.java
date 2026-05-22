package com.Spring.Practice.serviceImp;

import com.Spring.Practice.entity.Country;
import com.Spring.Practice.entity.Division;
import com.Spring.Practice.repository.CountryRepository;
import com.Spring.Practice.repository.DivisionRepository;
import com.Spring.Practice.service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DivisionServiceImpl implements DivisionService {
    @Autowired
    private DivisionRepository divisionRepository;

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public Division save(Division d) {
        Integer countryId= d.getCountry().getId();

        Country c= countryRepository.findById(countryId).orElseThrow(() -> new RuntimeException("country not found with this id"));
        d.setCountry(c);
        return divisionRepository.save(d);
    }

    @Override
    public List<Division> findAll() {
        return divisionRepository.findAll();
    }

    @Override
    public Optional<Division> getById(Integer id) {
        return divisionRepository.findById(id);
    }

    @Override
    public void delete(Integer id) {

        divisionRepository.deleteById(id);


    }
}
