package com.Spring.Practice.controller;

import com.Spring.Practice.entity.Division;
import com.Spring.Practice.service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/division/")
public class DivisionController {
    @Autowired
    private DivisionService divisionService;

    @PostMapping
    public ResponseEntity<Division> save(@RequestBody Division d){
        Division savedDivision = divisionService.save(d);
        return  ResponseEntity.ok(savedDivision);

    }
    @GetMapping
    public  ResponseEntity<List<Division>> getAll(){

        List<Division> list = divisionService.findAll();
        return  ResponseEntity.ok(list);
    }

}
