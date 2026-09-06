package com.trackflow.railway_schedular.repository;

import com.trackflow.railway_schedular.entity.Scenario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ScenarioRepository extends JpaRepository<Scenario, Long> {

    List<Scenario> findByNameContainingIgnoreCase(String keyword);
}