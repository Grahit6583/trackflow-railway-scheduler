package com.trackflow.railway_schedular.repository;

import com.trackflow.railway_schedular.entity.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SectionRepository extends JpaRepository<Section, Long> {
    List<Section> findByStatus_Name(String statusName);
}