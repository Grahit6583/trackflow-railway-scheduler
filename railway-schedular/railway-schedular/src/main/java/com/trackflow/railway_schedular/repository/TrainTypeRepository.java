package com.trackflow.railway_schedular.repository;

import com.trackflow.railway_schedular.entity.TrainType;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface TrainTypeRepository extends JpaRepository<TrainType, Long> {
    Optional<TrainType> findByName(String name);
}
