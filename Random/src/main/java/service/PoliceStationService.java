package service;

import entity.PoliceStation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PoliceStationRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PoliceStationService {
    @Autowired
    private PoliceStationRepository stationRepository;

    public List<PoliceStation> getAll(){
        return stationRepository.findAll();
    }
    public PoliceStation saveOrUpdate(PoliceStation p){
        return stationRepository.save(p);
    }

    public Optional<PoliceStation> getById(Long id){
        return stationRepository.findById(id);
    }
    public void delete(Long id){
        stationRepository.deleteById(id);
    }

}
