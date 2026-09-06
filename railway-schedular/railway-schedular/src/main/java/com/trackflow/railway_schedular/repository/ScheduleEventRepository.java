package com.trackflow.railway_schedular.repository;

import com.trackflow.railway_schedular.entity.ScheduleEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ScheduleEventRepository extends JpaRepository<ScheduleEvent, Long> {

    // All events for a train, most recent first — useful to find its current active event
    List<ScheduleEvent> findByTrain_IdOrderByCreatedAtDesc(Long trainId);

    // All events occupying a given block, excluding superseded ones
    List<ScheduleEvent> findByBlock_IdAndStatus_NameNot(Long blockId, String excludedStatus);

    // All events belonging to a specific what-if scenario
    List<ScheduleEvent> findByScenario_Id(Long scenarioId);

    // Live (non-simulated) events only
    List<ScheduleEvent> findByScenarioIsNull();
}