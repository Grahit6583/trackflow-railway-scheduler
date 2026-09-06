package com.trackflow.railway_schedular.repository;

import com.trackflow.railway_schedular.entity.SectionStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface SectionStatusRepository extends JpaRepository<SectionStatus, Long> {
    Optional<SectionStatus> findByName(String name);
}
