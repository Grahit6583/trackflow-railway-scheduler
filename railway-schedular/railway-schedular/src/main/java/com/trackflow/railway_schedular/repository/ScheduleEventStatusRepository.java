package com.trackflow.railway_schedular.repository;

import com.trackflow.railway_schedular.entity.ScheduleEventStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ScheduleEventStatusRepository extends JpaRepository<ScheduleEventStatus, Long> {
    Optional<ScheduleEventStatus> findByName(String name);
}
