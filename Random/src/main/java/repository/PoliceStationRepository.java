package repository;

import entity.PoliceStation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PoliceStationRepository extends JpaRepository<PoliceStation, Long> {
}
