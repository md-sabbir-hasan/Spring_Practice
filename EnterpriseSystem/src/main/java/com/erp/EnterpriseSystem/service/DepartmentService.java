package com.erp.EnterpriseSystem.service;

import com.erp.EnterpriseSystem.entity.Department;
import com.erp.EnterpriseSystem.entity.PoliceStation;
import com.erp.EnterpriseSystem.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    public List<Department> getAll(){
        return repository.findAll();

    }

    public Department saveOrUpdate(Department d){
        return   repository.save(d);
    }

    public Optional<Department> getById(long id){
        return repository.findById(id);
    }

    public  void  delete(long id){
        repository.deleteById(id);
    }
}
