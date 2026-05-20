package controller;

import entity.PoliceStation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.PoliceStationService;

import java.util.List;

@RestController
@RequestMapping("/api/policestation")
@CrossOrigin("*")
public class PoliceStationController {
    
    @Autowired
    private PoliceStationService stationService;
    
    @PostMapping
    public ResponseEntity<PoliceStation> save(@RequestBody PoliceStation p){
        PoliceStation savedPoliceStation= stationService.saveOrUpdate(p);
        return new ResponseEntity<>(savedPoliceStation, HttpStatus.CREATED);
    }
    
    @GetMapping
    public ResponseEntity<List<PoliceStation>> getAll(){
        List<PoliceStation> list = stationService.getAll();
        return ResponseEntity.ok(list);
    }
    
    @GetMapping("{id}")
    public  ResponseEntity<PoliceStation> getById(@PathVariable Long id){
        PoliceStation policeStation= stationService.getById(id).orElseThrow(() -> new RuntimeException("Police Station Not Found"));
        return ResponseEntity.ok(policeStation);
        
    }
    
    @PutMapping("/{id}")
    public  ResponseEntity<PoliceStation> update(@PathVariable Long id, @RequestBody PoliceStation policeStation){
        policeStation.setId(id);
        PoliceStation updatePoliceStation = stationService.saveOrUpdate(policeStation);
        return ResponseEntity.ok(updatePoliceStation);
    }
    
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id){
        stationService.delete(id);
        
        return  ResponseEntity.ok("Police Station Deleted Successfully");
        
    }
}
