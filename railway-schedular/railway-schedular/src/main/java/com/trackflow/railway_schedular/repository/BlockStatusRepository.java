package com.trackflow.railway_schedular.repository;

import com.trackflow.railway_schedular.entity.BlockStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface BlockStatusRepository extends JpaRepository<BlockStatus, Long> {
    Optional<BlockStatus> findByName(String name);
}