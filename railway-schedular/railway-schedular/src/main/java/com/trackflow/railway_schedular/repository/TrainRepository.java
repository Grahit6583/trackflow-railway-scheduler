package com.trackflow.railway_schedular.repository;

import com.trackflow.railway_schedular.entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface TrainRepository extends JpaRepository<Train, Long> {

    Optional<Train> findByNumber(String number);

    List<Train> findByType_Name(String typeName);

    List<Train> findByPriority_PriorityRankOrderByPriorityRankAsc(Integer priorityRank);
}
