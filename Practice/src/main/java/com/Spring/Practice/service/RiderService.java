package com.Spring.Practice.service;


import com.Spring.Practice.entity.Rider;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

public interface RiderService {

    Rider save(Rider r, MultipartFile image);
    List<Rider> findAll();
    Optional<Rider> getById(Integer id);
    void delete(Integer id);


}
