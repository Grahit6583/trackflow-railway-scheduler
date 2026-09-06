package com.trackflow.railway_schedular.repository;

import com.trackflow.railway_schedular.entity.BlockType;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface BlockTypeRepository extends JpaRepository<BlockType, Long> {
    Optional<BlockType> findByName(String name);
}
