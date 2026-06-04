package com.Spring.Practice.service;
import com.Spring.Practice.entity.Customer;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    Customer save(Customer c, MultipartFile file);
    List<Customer> findAll();
    Optional<Customer> getById(Long id);
    void delete(Long id);

}
