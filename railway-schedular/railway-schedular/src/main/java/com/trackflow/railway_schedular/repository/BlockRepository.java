package com.trackflow.railway_schedular.repository;

import com.trackflow.railway_schedular.entity.Block;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BlockRepository extends JpaRepository<Block, Long> {

    List<Block> findBySection_IdOrderBySequenceOrderAsc(Long sectionId);

    List<Block> findByStatus_Name(String statusName);
}