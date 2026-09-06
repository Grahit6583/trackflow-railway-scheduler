package com.trackflow.railway_schedular.repository;

import com.trackflow.railway_schedular.entity.TrainPriority;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface TrainPriorityRepository extends JpaRepository<TrainPriority, Long> {
    Optional<TrainPriority> findByName(String name);
}
