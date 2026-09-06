package com.trackflow.railway_schedular.repository;

import com.trackflow.railway_schedular.entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface StationRepository extends JpaRepository<Station,Long>{
    Optional<Station> findByCode(String code);
}
