package com.Spring.Practice.service;
import com.Spring.Practice.entity.User;
import java.util.List;
import java.util.Optional;

public interface UserService {

    User save(User u);
    List<User> findAll();
    Optional<User> getById(Long id);
    void delete(Long id);

}
